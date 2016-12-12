/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stackleader.drools.netbeans.completion;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
import static org.drools.compiler.compiler.DRLFactory.buildParser;
import org.drools.compiler.lang.DRLParser;
import org.drools.compiler.lang.DroolsEditorType;
import org.drools.compiler.lang.DroolsToken;
import org.drools.compiler.lang.Location;
import org.kie.internal.builder.conf.LanguageLevelOption;

/**
 * A utility class that invokes the DRLParser on some partial drl text, and
 * provides information back about the context of that parsed drl, such as a
 * location type, a dialect, and so on.
 */
public class CompletionContext {

    static final Pattern MVEL_DIALECT_PATTERN = Pattern.compile(
            ".*dialect\\s+\"mvel\".*", Pattern.DOTALL);

    static final Pattern JAVA_DIALECT_PATTERN = Pattern.compile(
            ".*dialect\\s+\"java\".*", Pattern.DOTALL);

    static final String MVEL_DIALECT = "mvel";
    static final String JAVA_DIALECT = "java";

    private LinkedList<Object> parserList;
    private int location;
    private int locationIndex;
    private String dialect;

    @SuppressWarnings("unchecked")
    public CompletionContext(String backText) {
        DRLParser parser = getParser(backText);

        try {
            parser.compilationUnit();
        } catch (Exception ex) {
        }
        parserList = parser.getEditorInterface().get(0).getContent();
        deriveLocation();
        determineDialect(backText);
    }

    public boolean isJavaDialect() {
        return JAVA_DIALECT.equalsIgnoreCase(dialect);
    }

    public boolean isMvelDialect() {
        return MVEL_DIALECT.equalsIgnoreCase(dialect);
    }

    public boolean isDefaultDialect() {
        return !isJavaDialect() && !isMvelDialect();
    }

    // note: this is a crude but reasonably fast way to determine the dialect,
    // especially when parsing incomplete rules
    private void determineDialect(String backText) {
        dialect = null;
        boolean mvel = MVEL_DIALECT_PATTERN.matcher(backText).matches();
        boolean java = JAVA_DIALECT_PATTERN.matcher(backText).matches();
        if (mvel) {
            dialect = MVEL_DIALECT;
        } else if (java) {
            dialect = JAVA_DIALECT;
        }
    }

    public Location getLocation() {
        Location location = new Location(this.location);
        switch (this.location) {
            case Location.LOCATION_LHS_INSIDE_CONDITION_START:
                int index = findToken("(", Location.LOCATION_LHS_INSIDE_CONDITION_START, locationIndex);
                if (index != -1) {
                    Object o = parserList.get(index - 1);
                    if (o instanceof DroolsToken) {
                        String className = ((DroolsToken) o).getText();
                        location.setProperty(Location.LOCATION_PROPERTY_CLASS_NAME, className);
                    }
                }
                String propertyName = null;
                if (index + 1 < parserList.size()) {
                    propertyName = "";
                }
                int i = index + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        propertyName += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_PROPERTY_PROPERTY_NAME, propertyName);
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR:
                index = findToken("(", Location.LOCATION_LHS_INSIDE_CONDITION_START, locationIndex);
                if (index != -1) {
                    Object o = parserList.get(index - 1);
                    if (o instanceof DroolsToken) {
                        String className = ((DroolsToken) o).getText();
                        location.setProperty(Location.LOCATION_PROPERTY_CLASS_NAME, className);
                    }
                }
                propertyName = null;
                index = findTokenBack(Location.LOCATION_LHS_INSIDE_CONDITION_START, locationIndex);
                if (index != -1) {
                    if (index + 1 < locationIndex) {
                        propertyName = "";
                    }
                    i = index + 1;
                    while (i < locationIndex) {
                        Object o = parserList.get(i++);
                        if (o instanceof DroolsToken) {
                            String token = ((DroolsToken) o).getText();
                            if (":".equals(token)) {
                                propertyName = "";
                            } else {
                                propertyName += token;
                            }
                        } else {
                            break;
                        }
                    }
                    location.setProperty(Location.LOCATION_PROPERTY_PROPERTY_NAME, propertyName);
                }
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT:
                int index1 = findToken("(", Location.LOCATION_LHS_INSIDE_CONDITION_START, locationIndex);
                int index2 = findTokenBack(Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR, locationIndex);
                int index3 = findTokenBack(Location.LOCATION_LHS_INSIDE_CONDITION_START, locationIndex);
                int index4 = findTokenBack(Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT, locationIndex);
                if (index1 != -1 && index2 != -1) {
                    Object o = parserList.get(index1 - 1);
                    if (o instanceof DroolsToken) {
                        String className = ((DroolsToken) o).getText();
                        location.setProperty(Location.LOCATION_PROPERTY_CLASS_NAME, className);
                    }
                }
                String operator = "";
                for (i = index2 + 1; i < locationIndex; i++) {
                    Object o = parserList.get(i);
                    if (o instanceof DroolsToken) {
                        operator += ((DroolsToken) o).getText();
                    }
                    if (index4 != -1 && i >= index4) {
                        break;
                    }
                    if (i < locationIndex - 1) {
                        operator += " ";
                    }
                }
                location.setProperty(Location.LOCATION_PROPERTY_OPERATOR, operator.trim());
                propertyName = null;
                if (index1 != -1) {
                    if (index3 + 1 < locationIndex - 1) {
                        propertyName = "";
                    }
                    i = index3 + 1;
                    while (i < locationIndex - 1) {
                        Object o = parserList.get(i++);
                        if (o instanceof DroolsToken) {
                            String token = ((DroolsToken) o).getText();
                            if (":".equals(token)) {
                                propertyName = "";
                            } else {
                                propertyName += token;
                            }
                        } else {
                            break;
                        }
                    }
                    location.setProperty(Location.LOCATION_PROPERTY_PROPERTY_NAME, propertyName);
                }
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_END:
                index = findToken("(", Location.LOCATION_LHS_INSIDE_CONDITION_START, locationIndex);
                if (index != -1) {
                    Object o = parserList.get(index - 1);
                    if (o instanceof DroolsToken) {
                        String className = ((DroolsToken) o).getText();
                        location.setProperty(Location.LOCATION_PROPERTY_CLASS_NAME, className);
                    }
                }
                break;
            case Location.LOCATION_LHS_INSIDE_EVAL:
                String eval = "";
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        eval += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_EVAL_CONTENT, eval.trim());
                break;
            case Location.LOCATION_LHS_FROM:
                String from = null;
                if (locationIndex + 1 < parserList.size()) {
                    from = "";
                }
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        from += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_FROM_CONTENT, from);
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE:
                from = "";
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        from += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_PROPERTY_FROM_ACCUMULATE_INIT_CONTENT, from);
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE:
                from = "";
                index = findTokenBack(Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE, locationIndex);
                index2 = findTokenBack(Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION, locationIndex);
                if (index != -1 && index2 != -1) {
                    for (i = index + 1; i < index2 - 3; i++) {
                        Object o = parserList.get(i);
                        if (o instanceof DroolsToken) {
                            from += ((DroolsToken) o).getText();
                        }
                    }
                    location.setProperty(Location.LOCATION_PROPERTY_FROM_ACCUMULATE_INIT_CONTENT, from.trim());
                }
                from = "";
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        from += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_PROPERTY_FROM_ACCUMULATE_ACTION_CONTENT, from);
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE:
                from = "";
                index = findTokenBack(Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE, locationIndex);
                index2 = findTokenBack(Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION, locationIndex);
                index3 = findTokenBack(Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE, locationIndex);
                index4 = findTokenBack(Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT, locationIndex);
                if (index != -1 && index2 != -1) {
                    for (i = index + 1; i < index2 - 3; i++) {
                        Object o = parserList.get(i);
                        if (o instanceof DroolsToken) {
                            from += ((DroolsToken) o).getText();
                        }
                    }
                    location.setProperty(Location.LOCATION_PROPERTY_FROM_ACCUMULATE_INIT_CONTENT, from.trim());
                }
                from = "";
                if (index3 != -1 && index4 != -1) {
                    for (i = index3 + 1; i < index4 - 3; i++) {
                        Object o = parserList.get(i);
                        if (o instanceof DroolsToken) {
                            from += ((DroolsToken) o).getText();
                        }
                    }
                    location.setProperty(Location.LOCATION_PROPERTY_FROM_ACCUMULATE_ACTION_CONTENT, from);
                }
                from = "";
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        from += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_PROPERTY_FROM_ACCUMULATE_RESULT_CONTENT, from);
                break;
            case Location.LOCATION_RHS:
                String rhs = "";
                i = locationIndex + 1;
                int endLocationOfLast = Integer.MAX_VALUE - 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        DroolsToken token = (DroolsToken) o;
                        if (endLocationOfLast + 1 < token.getStartIndex()) {
                            rhs += " ";
                        }
                        rhs += token.getText();
                        endLocationOfLast = token.getStopIndex();
                    }
                }
                location.setProperty(Location.LOCATION_RHS_CONTENT, rhs);
                break;
            case Location.LOCATION_RULE_HEADER:
                String header = "";
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        header += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_HEADER_CONTENT, header);
                break;
            case Location.LOCATION_RULE_HEADER_KEYWORD:
                header = "";
                index = findTokenBack(Location.LOCATION_RULE_HEADER, locationIndex);
                if (index != -1) {
                    for (i = index + 1; i < locationIndex; i++) {
                        Object o = parserList.get(i);
                        if (o instanceof DroolsToken) {
                            header += ((DroolsToken) o).getText();
                        }
                    }
                }
                i = locationIndex + 1;
                while (i < parserList.size()) {
                    Object o = parserList.get(i++);
                    if (o instanceof DroolsToken) {
                        header += ((DroolsToken) o).getText();
                    }
                }
                location.setProperty(Location.LOCATION_HEADER_CONTENT, header.trim());
                break;
        }
        return location;
    }

    public String getRuleName() {
        if (parserList.size() >= 2) {
            Object o = parserList.get(1);
            if (o instanceof DroolsToken) {
                String name = ((DroolsToken) o).getText();
                if (name.startsWith("\"") && (name.endsWith("\""))) {
                    name = name.substring(1, name.length() - 1);
                }
                return name;
            }
        }
        return null;
    }

    /**
     * Returns the variables defined in the given rule (fragment).
     * The key is the name of the variable.
     * The value is a list of 2 String:
     * - the first one is the class name of the variable
     * - the second one is the property of the given class that defines the type of this variable,
     * note that this property could be nested,
     * if this property is null then the given class is the type of the variable
     */
    public Map<String, String[]> getRuleParameters() {
        Map<String, String[]> result = new HashMap<String, String[]>();
        int i = 0;
        int lastLocation = -1;
        for (Object o : parserList) {
            if (o instanceof DroolsToken) {
                DroolsToken token = (DroolsToken) o;
                if (DroolsEditorType.IDENTIFIER_VARIABLE.equals(token.getEditorType()) || DroolsEditorType.IDENTIFIER_PATTERN.equals(token.getEditorType())) {
                    String variableName = token.getText();
                    if (lastLocation == Location.LOCATION_LHS_BEGIN_OF_CONDITION) {
                        int j = i + 2;
                        String className = "";
                        while (j < parserList.size()) {
                            Object obj = parserList.get(j++);
                            if (obj instanceof DroolsToken) {
                                String s = ((DroolsToken) obj).getText();
                                if ("(".equals(s)) {
                                    result.put(variableName, new String[]{className, null});
                                    break;
                                } else {
                                    className += s;
                                }

                            }
                        }
                    } else if (lastLocation == Location.LOCATION_LHS_INSIDE_CONDITION_START) {
                        int index = findTokenBack(Location.LOCATION_LHS_BEGIN_OF_CONDITION, i);
                        int j = index + 3;
                        String className = "";
                        while (j < i) {
                            Object obj = parserList.get(j++);
                            if (obj instanceof DroolsToken) {
                                String s = ((DroolsToken) obj).getText();
                                if ("(".equals(s)) {
                                    break;
                                } else {
                                    className += s;
                                }

                            }
                        }
                        j = i + 2;
                        String propertyName = "";
                        while (j < parserList.size()) {
                            Object obj = parserList.get(j++);
                            if (obj instanceof DroolsToken) {
                                String s = ((DroolsToken) obj).getText();
                                if (",".equals(s) || ")".equals(s)) {
                                    result.put(variableName, new String[]{className, propertyName});
                                    break;
                                } else {
                                    propertyName += s;
                                }
                            } else {
                                result.put(variableName, new String[]{className, propertyName});
                            }
                        }
                    }
                }
            } else if (o instanceof Integer) {
                lastLocation = (Integer) o;
            }
            i++;
        }
        return result;
    }

    private int findToken(String token, int integer, int location) {
        int index = location - 1;
        while (index >= 0) {
            Object o = parserList.get(index);
            if (o instanceof DroolsToken) {
                if ("(".equals(((DroolsToken) o).getText())) {
                    if (getNextInteger(index) == integer) {
                        return index;
                    }
//                    o = parserList.get(index + 1);
//                    if (o instanceof Integer) {
//                        if (integer == (Integer) o) {
//                            return index;
//                        }
//                    }
                }
            }
            index--;
        }
        return -1;
    }

    private int findTokenBack(int token, int location) {
        int index = location - 1;
        while (index >= 0) {
            Object o = parserList.get(index);
            if (o instanceof Integer) {
                if (token == (Integer) o) {
                    return index;
                }
            }
            index--;
        }
        return -1;
    }

    private int getNextInteger(int location) {
        int index = location;
        while (index >= 0) {
            Object o = parserList.get(index);
            if (o instanceof Integer) {
                return (Integer) o;
            }
            index++;
        }
        return -1;
    }

    private void deriveLocation() {
        location = -1;
        int i = 0;
        for (Object object : parserList) {
            if (object instanceof Integer) {
                location = (Integer) object;
                locationIndex = i;
            }
            i++;
        }
    }

    private DRLParser getParser(final String text) {
        // TODO: support different language levels
        DRLParser parser = buildParser(text, LanguageLevelOption.DRL5);
        parser.enableEditorInterface();
        return parser;
    }

    public static String stripLastWord(String prefix) {
        if ("".equals(prefix)) {
            return prefix;
        }
        if (prefix.charAt(prefix.length() - 1) == ' ') {
            return "";
        } else {
            char[] c = prefix.toCharArray();
            int start = 0;
            for (int i = c.length - 1; i >= 0; i--) {
                if (Character.isWhitespace(c[i]) || c[i] == '(' || c[i] == ':' || c[i] == ';' || c[i] == '=' || c[i] == '<' || c[i] == '>' || c[i] == '.' || c[i] == '{' || c[i] == '}') {
                    start = i + 1;
                    break;
                }
            }
            prefix = prefix.substring(start,
                    prefix.length());
            return prefix;
        }
    }
}
