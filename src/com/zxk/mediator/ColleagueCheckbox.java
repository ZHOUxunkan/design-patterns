package com.zxk.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class ColleagueCheckbox extends Checkbox implements ItemListener,Colleague {
    private Mediator mediator;

    public ColleagueCheckbox(String label, boolean state, CheckboxGroup group) throws HeadlessException {
        super(label, state, group);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
