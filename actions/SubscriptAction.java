package com.codegym.task.task32.task3209.actions;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class SubscriptAction extends StyledEditorKit.StyledTextAction {

    /**
     * Creates a new StyledTextAction from a string action name.
     *
     * @param nm the name of the action
     */
    public SubscriptAction(String nm) {
        super(nm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JEditorPane editor = getEditor(e);
        if (editor != null) {
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(editor).getInputAttributes();
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            StyleConstants.setSubscript(simpleAttributeSet, !StyleConstants.isSubscript(mutableAttributeSet));
            setCharacterAttributes(editor, simpleAttributeSet, false);
        }
    }

    public SubscriptAction() {
        super(StyleConstants.Subscript.toString());
    }
}
