package org.visualizer.window;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VisualFrame extends JPanel {
    Graphics g;

    VisualFrame(){
        setSize(100,100);
//        setVisible(true);
        setBackground(Color.CYAN);
//        createBars();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g = (Graphics2D) g;
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        drawChart(list);
    }

    private void drawChart(List<Integer> list){

        final int BAR_WIDTH = 4;
        final int MAX_BAR_HEIGHT = getHeight();
        final int BAR_NUM = list.size();

        for (int i = 0; i < BAR_NUM; i++) {
            int barHeight = list.get(i);
            System.out.println(barHeight);
            int x = i * BAR_WIDTH;
            int y = MAX_BAR_HEIGHT - barHeight;

            this.g.setColor(Color.BLUE);
            g.fillRect(x, y, BAR_WIDTH - 10, barHeight);

        }
    }

    public Integer getBarNum(){
        final int BAR_WIDTH = 4;
        return getWidth()/BAR_WIDTH;
    }

}
