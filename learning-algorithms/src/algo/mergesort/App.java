/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.mergesort;

import static algo.selectionsort.App.selectionSort;

/**
 *
 * @author engmi
 */
public class App {

    public static void main(String[] args) {

        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        MergeSort sorter = new MergeSort();

        sorter.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }

    }
}
