package org.visualizer.window;

import org.visualizer.algorithms.BubbleSort;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MenuFrame extends JPanel {
    MyButton b1,b2,b3;

    MenuFrame(){
        setBackground(Color.GREEN);
        addButtons();
    }

    public void addButtons(){
        b1 = new MyButton("Bubble Sort");
        BubbleSort s1 = new BubbleSort();
        b2 = new MyButton("Select Sort");
        b3 = new MyButton("Insert Sort");
        b1.setColor(Color.CYAN);
        b2.setColor(Color.GREEN);
        b3.setColor(Color.BLACK);

        // adding the buttons to frame
        this.add(b1); this.add(b2); this.add(b3);
    }
    
    public List<MyButton> getButtons(){
        return List.of(b1,b2,b3);
    }

}
