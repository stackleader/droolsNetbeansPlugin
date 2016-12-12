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

    private String text;
    private int caretOffset;

    public DroolsRuleCompletionItem(String text, int caretOffset) {
        this.text = text;
        this.caretOffset = caretOffset;
    }

    @Override
    public void defaultAction(JTextComponent jtc) {
        try {
            int pos = jtc.getCaretPosition();
//            int pos1 = Utilities.getWordEnd(jtc, pos);
            Document d = jtc.getDocument();
            d.insertString(pos, text, null);
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
        return CompletionUtilities.getPreferredWidth(text, null, graphics, font);
    }

    @Override
    public void render(Graphics g, Font defaultFont, Color defaultColor, Color bg, int width, int height, boolean selected) {
        CompletionUtilities.renderHtml(null, text, null, g, defaultFont, defaultColor, width, height, selected);
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
        return text;
    }

    @Override
    public CharSequence getInsertPrefix() {
        return text;
    }
}
