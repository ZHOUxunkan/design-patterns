package com.zxk.mediator;

import java.awt.*;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;

    public ColleagueButton(String label){
        super(label);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
