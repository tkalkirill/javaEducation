package org.tkalenko.education.java.algorithm.sort.bubble;

public class BubbleOptimize extends Bubble {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 2) return;
        boolean swap = true;
        int i = -1, j;
        while (swap) {
            swap = false;
            i++;
            for (j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                    swap = true;
                }
            }
        }
    }
}
