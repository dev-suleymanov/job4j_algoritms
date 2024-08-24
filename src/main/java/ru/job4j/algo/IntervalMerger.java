package ru.job4j.algo;

import java.util.Arrays;
import java.util.Comparator;

public class IntervalMerger {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[][] result = new int[intervals.length][2];
        int size = 0;
        int[] currentInterval = intervals[0];
        result[size] = currentInterval;
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = nextInterval[1];
            } else {
                size++;
                currentInterval = nextInterval;
                result[size] = currentInterval;
            }
        }
        return Arrays.copyOf(result, size + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1, 4}, {0, 2}, {3, 5}}; // [0, 2] [1, 4] [3, 5]
        int[][] result = merge(intervals);
        Arrays.stream(result).forEach(el -> System.out.println(Arrays.toString(el)));
    }
}
