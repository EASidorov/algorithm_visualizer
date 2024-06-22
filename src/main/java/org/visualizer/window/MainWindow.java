package org.visualizer.window;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame{

    public MainWindow() {
        drawMainWindow();
    }

    private Dimension getFrameSize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenSize.width = screenSize.width/2;
        screenSize.height = screenSize.height/2;
        return screenSize;
    }

    private void drawMainWindow(){
        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(getFrameSize());
        setLocationRelativeTo(null);
    }

    public MenuFrame addMenuToMainWindow(){
        MenuFrame menuFrame = new MenuFrame();
        this.add(menuFrame, BorderLayout.NORTH);
        return menuFrame;
    }

    public VisualFrame addVisualsToMainWindow(){
        VisualFrame visualFrame = new VisualFrame();
        this.add(visualFrame, BorderLayout.CENTER);
        return visualFrame;
    }
}
