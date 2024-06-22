package org.visualizer;


import org.visualizer.window.MainWindow;

public class Main{
    public static void main(String[] args) {

        System.out.print("Hello and welcome!\n");
        MainWindow mainWindow = new MainWindow();
        Controller controller = new Controller().run(mainWindow);

    }
}