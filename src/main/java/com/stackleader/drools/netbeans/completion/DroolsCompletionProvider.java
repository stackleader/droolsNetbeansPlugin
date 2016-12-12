package com.stackleader.drools.netbeans.completion;

import java.util.HashMap;
import java.util.Map;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.drools.compiler.lang.Location;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;

/**
 *
 * @author dcnorris
 */
@MimeRegistration(mimeType = "text/x-drools-rule", service = CompletionProvider.class)
public class DroolsCompletionProvider implements CompletionProvider {

    private Map<String, String> headerOptionsMap;
    private Map<String, String> rhsOptionsMap;
    private Map<String, String> lhsConditionOptions;

    public DroolsCompletionProvider() {
        headerOptionsMap = new HashMap<>();
        rhsOptionsMap = new HashMap<>();
        lhsConditionOptions = new HashMap<>();
        initializeHeaderOptions();
        initializeRhsOptions();
        initializeLhsOptions();
    }

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        if (queryType == CompletionProvider.COMPLETION_QUERY_TYPE) {
            return createCompletionTask(jtc);
        }
        return null;
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        return 0;
    }

    private CompletionTask createCompletionTask(JTextComponent jtc) {
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            @Override
            protected void query(CompletionResultSet result, Document dcmnt, int carotOffset) {
                try {
                    final String backText = dcmnt.getText(0, carotOffset);
                    CompletionContext context = new CompletionContext(backText);
                    Location location = context.getLocation();
                    final String prefix = CompletionContext.stripLastWord(backText);
                    if (location.getType() == Location.LOCATION_RULE_HEADER) {
                        addRuleHeaderOptions(result, carotOffset, prefix);
                    } else if (location.getType() == Location.LOCATION_RHS) {
                        addRHSCompletionOptions(result, carotOffset, prefix);
                    } else {
                        addLHSCompletionOptions(result, carotOffset, prefix, location);
                    }
                } catch (Exception ex) {
                }
                result.finish();
            }
        }, jtc);
    }

    private void addRuleHeaderOptions(CompletionResultSet result, int caretOffset, String prefix) {
        if (prefix.isEmpty()) {
            headerOptionsMap.forEach((String key, String value) -> {
                result.addItem(new DroolsRuleCompletionItem(key, value, caretOffset));
            });
        } else {
            headerOptionsMap.keySet().stream().filter(key -> key.startsWith(prefix))
                    .forEach(option -> result.addItem(new DroolsRuleCompletionItem(option, headerOptionsMap.get(option), caretOffset)));
        }
    }

    private void initializeHeaderOptions() {
        headerOptionsMap.put("salience", "salience ");
        headerOptionsMap.put("no-loop", "no-loop ");
        headerOptionsMap.put("agenda-group", "agenda-group ");
        headerOptionsMap.put("duration", "duration ");
        headerOptionsMap.put("auto-focus", "auto-focus ");
        headerOptionsMap.put("when", "when" + System.getProperty("line.separator") + "\t ");
        headerOptionsMap.put("activation-group", "activation-group ");
        headerOptionsMap.put("date-effective", "date-effective \"dd-MMM-yyyy\"");
        headerOptionsMap.put("date-expires", "date-expires \"dd-MMM-yyyy\"");
        headerOptionsMap.put("enabled", "enabled false");
        headerOptionsMap.put("ruleflow-group", "ruleflow-group \"\"");
        headerOptionsMap.put("lock-on-active", "lock-on-active ");
        headerOptionsMap.put("dialect \"java\"", "dialect \"java\" ");
        headerOptionsMap.put("dialect \"mvel\"", "dialect \"mvel\" ");
    }

    private void addRHSCompletionOptions(CompletionResultSet result, int caretOffset, String prefix) {
        if (prefix.isEmpty()) {
            rhsOptionsMap.forEach((String key, String value) -> {
                result.addItem(new DroolsRuleCompletionItem(key, value, caretOffset));
            });
        } else {
            rhsOptionsMap.keySet().stream().filter(key -> key.startsWith(prefix))
                    .forEach(option -> result.addItem(new DroolsRuleCompletionItem(option, headerOptionsMap.get(option), caretOffset)));
        }
    }

    private void addLHSCompletionOptions(CompletionResultSet result, int caretOffset, String prefix, Location location) {
        switch (location.getType()) {
            case Location.LOCATION_LHS_BEGIN_OF_CONDITION:
                if (prefix.isEmpty()) {
                    lhsConditionOptions.forEach((String key, String value) -> {
                        result.addItem(new DroolsRuleCompletionItem(key, value, caretOffset));
                    });
                } else {
                    lhsConditionOptions.keySet().stream().filter(key -> key.startsWith(prefix))
                            .forEach(option -> result.addItem(new DroolsRuleCompletionItem(option, headerOptionsMap.get(option), caretOffset)));
                }
            case Location.LOCATION_LHS_BEGIN_OF_CONDITION_AND_OR:
                break;
            case Location.LOCATION_LHS_BEGIN_OF_CONDITION_NOT:
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE:
                break;
            case Location.LOCATION_LHS_FROM_COLLECT:
                break;
            case Location.LOCATION_LHS_BEGIN_OF_CONDITION_EXISTS:
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_START:
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR:
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT:
                break;
            case Location.LOCATION_LHS_INSIDE_EVAL:
                break;
            case Location.LOCATION_LHS_INSIDE_CONDITION_END:
                break;
            case Location.LOCATION_LHS_FROM:
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE:
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE:
                break;
            case Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE:
                break;
        }

    }

    private void initializeRhsOptions() {
    }

    private void initializeLhsOptions() {
        lhsConditionOptions.put("and", "and ");
        lhsConditionOptions.put("or", "or ");
        lhsConditionOptions.put("from", "from ");
        lhsConditionOptions.put("forall", "forall(  )");
        lhsConditionOptions.put("eval", "eval(  )");
        lhsConditionOptions.put("then", "then" + System.getProperty("line.separator") + "\t");

    }

}
