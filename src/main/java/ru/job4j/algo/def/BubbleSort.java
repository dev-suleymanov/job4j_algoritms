package ru.job4j.algo.def;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length; i++) {
                if (i + 1 < array.length && array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] inArray = {1, 4, 3, 2, 0, 7, 10, 11, 5, 25, 13};
        int[] outArray = sort(inArray);
        System.out.println(Arrays.toString(outArray));
    }
}
