package ru.job4j.algo;

import java.util.Arrays;

public class SmallestRangeFinder {
    public static int[] findSmallestRange(int[] nums, int k) {
        boolean isSuccessful = false;
        int size = 0;
        int combination = 0;
        int point = nums[0];
        int startIndex = 0;
        int endIndex = 0;
        while (size != nums.length) {
            if (point == nums[size]) {
                combination = 0;
                startIndex = size;
            } else {
                combination++;
                if (combination == k - 1) {
                    endIndex = size;
                    isSuccessful = true;
                }
            }
            point = nums[size];
            size++;
        }
        return isSuccessful ? new int[]{startIndex, endIndex} : null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int k = 4;
        int[] result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }
}