package com.zxk.command.drawer;

import com.zxk.command.command.Command;
import com.zxk.command.command.MacroCommand;

import java.awt.*;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.cyan;
    private int radius = 6;
    private Command history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.BLACK);
        this.history = history;
    }

    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
