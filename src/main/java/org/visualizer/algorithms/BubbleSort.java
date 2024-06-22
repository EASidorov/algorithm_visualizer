package org.visualizer.algorithms;

import org.visualizer.window.VisualFrame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BubbleSort {

    public void sort(){
        Integer len = 100;

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println(numbers);


    };
}
