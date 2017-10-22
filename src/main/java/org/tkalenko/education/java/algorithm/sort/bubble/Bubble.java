package org.tkalenko.education.java.algorithm.sort.bubble;

import org.tkalenko.education.java.algorithm.sort.Sort;

public class Bubble implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 0) return;
        for (int i = 0, j; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }
    }
}
