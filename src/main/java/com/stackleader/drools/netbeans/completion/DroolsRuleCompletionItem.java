package com.stackleader.drools.netbeans.completion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.completion.Completion;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;

/**
 *
 * @author dcnorris
 */
public class DroolsRuleCompletionItem implements CompletionItem {

    private String displayText;
    private String insertText;
    private int caretOffset;

    public DroolsRuleCompletionItem(String displayText, int caretOffset) {
        this.displayText = displayText;
        this.insertText = displayText;
        this.caretOffset = caretOffset;
    }

    public DroolsRuleCompletionItem(String displayText, String insertText, int caretOffset) {
        this.displayText = displayText;
        this.insertText = insertText;
        this.caretOffset = caretOffset;
    }

    @Override
    public void defaultAction(JTextComponent jtc) {
        try {
            final String backText = jtc.getText(0, caretOffset);
            final String prefix = CompletionContext.stripLastWord(backText);
            int pos = jtc.getCaretPosition();
            Document d = jtc.getDocument();
            d.insertString(pos, insertText, null);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        Completion.get().hideCompletion();
    }

    @Override
    public void processKeyEvent(KeyEvent ke) {
    }

    @Override
    public int getPreferredWidth(Graphics graphics, Font font) {
        return CompletionUtilities.getPreferredWidth(displayText, null, graphics, font);
    }

    @Override
    public void render(Graphics g, Font defaultFont, Color defaultColor, Color bg, int width, int height, boolean selected) {
        CompletionUtilities.renderHtml(null, displayText, null, g, defaultFont, defaultColor, width, height, selected);
    }

    @Override
    public CompletionTask createDocumentationTask() {
        return null;
    }

    public CompletionTask createToolTipTask() {
        return null;
    }

    public boolean instantSubstitution(JTextComponent jTextComponent) {
        defaultAction(jTextComponent);
        return true;
    }

    public int getSortPriority() {
        return 1;
    }

    public CharSequence getSortText() {
        return displayText;
    }

    @Override
    public CharSequence getInsertPrefix() {
        return displayText;
    }
}
