package ru.job4j.algo.def;

import java.util.Arrays;

public class SelectionAlgorithm {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int[] minValueAndIndexArray = getMinValueAndIndex(array, i);
            int temp = array[i];
            array[i] = minValueAndIndexArray[0];
            array[minValueAndIndexArray[1]] = temp;
        }
        return array;
    }

    private static int[] getMinValueAndIndex(int[] array, int startIndex) {
        int minValue = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return new int[]{minValue, minIndex};
    }

    public static void main(String[] args) {
        int[] inArray = {25, 1, 4, 3, 2, 0, 13, 7, 10, 11, 5, 25, 13};
        sort(inArray);
        System.out.println(Arrays.toString(inArray));
    }
}
