package org.tkalenko.education.java.algorithm.sort.bubble;

public class Cocktail extends Bubble {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 0) return;
        boolean swap = true;
        int start = 0, end = array.length - 1, i;
        while (swap) {
            swap = false;
            for (i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] += array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] -= array[i + 1];
                    swap = true;
                }
            }
            end--;
            for (i = end; i > start; i--) {
                if (array[i - 1] > array[i]) {
                    array[i - 1] += array[i];
                    array[i] = array[i - 1] - array[i];
                    array[i - 1] -= array[i];
                    swap = true;
                }
            }
            start++;
        }
    }
}
