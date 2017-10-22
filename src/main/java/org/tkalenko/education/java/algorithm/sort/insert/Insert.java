package org.tkalenko.education.java.algorithm.sort.insert;

import org.tkalenko.education.java.algorithm.sort.Sort;

public class Insert implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 2) return;
        for (int i = 1, j; i < array.length; i++) {
            for (j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    array[j] += array[j - 1];
                    array[j - 1] = array[j] - array[j - 1];
                    array[j] -= array[j - 1];
                } else {
                    break;
                }
            }
        }
    }
}
