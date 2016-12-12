package com.stackleader.drools.netbeans.completion;

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
                    if (location.getType() == Location.LOCATION_RULE_HEADER) {
                        result.addItem(new DroolsRuleCompletionItem("Header", carotOffset));
//                addRuleHeaderProposals( list,
//                                        documentOffset,
//                                        prefix,
//                                        backText );
                    } else if (location.getType() == Location.LOCATION_RHS) {
                        result.addItem(new DroolsRuleCompletionItem("RHS", carotOffset));
//                addRHSCompletionProposals( list,
//                                           documentOffset,
//                                           prefix,
//                                           backText,
//                                           (String) location.getProperty( Location.LOCATION_LHS_CONTENT ),
//                                           (String) location.getProperty( Location.LOCATION_RHS_CONTENT ) );
                    } else {
                        result.addItem(new DroolsRuleCompletionItem("LHS", carotOffset));
//                addLHSCompletionProposals( list,
//                                           documentOffset,
//                                           location,
//                                           prefix,
//                                           backText );
                    }
                } catch (Exception ex) {
                }
                result.finish();
            }
        }, jtc);
    }

}
