package org.visualizer;

import org.visualizer.window.MainWindow;
import org.visualizer.window.MenuFrame;
import org.visualizer.window.MyButton;
import org.visualizer.window.VisualFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    MainWindow mainWindow;
    MenuFrame menu;
    VisualFrame visuals;

    public Controller run(MainWindow mainWindow){
        menu = mainWindow.addMenuToMainWindow();
        visuals = mainWindow.addVisualsToMainWindow();
        setButtonsTarget();
        return new Controller();
    }

    private void setButtonsTarget(){
        for (MyButton button: menu.getButtons()) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setTargetColor(visuals);
                }
            });
        }
    }
}
