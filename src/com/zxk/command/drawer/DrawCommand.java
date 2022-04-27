package com.zxk.command.drawer;

import com.zxk.command.command.Command;

import java.awt.*;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
