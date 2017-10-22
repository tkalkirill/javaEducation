package org.tkalenko.education.java.algorithm.sort.bubble;

public class OddEven extends Bubble {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 2) return;
        for (int i = 0, j; i < array.length; i++) {
            if ((i & 1) == 0) {
                //even
                j = 0;
            } else {
                //odd
                j = 1;
            }
            for (; j < array.length - 1; j += 2) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }
    }
}
