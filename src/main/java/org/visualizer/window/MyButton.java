package org.visualizer.window;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    Color color;

    public MyButton(String bubbleSort) {
        super(bubbleSort);
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public void setTargetColor(JComponent target) {
        target.setBackground(color);
    }
}
