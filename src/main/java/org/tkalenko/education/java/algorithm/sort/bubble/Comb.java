package org.tkalenko.education.java.algorithm.sort.bubble;

public class Comb extends Bubble {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 0) return;
        boolean swap = true;
        double fakt = 1.3d;
        int i, step = array.length;
        while (step > 1 || swap) {
            swap = false;
            if (step > 1) {
                step /= fakt;
            }
            for (i = 0; i + step < array.length; i++) {
                if (array[i] > array[i + step]) {
                    array[i] += array[i + step];
                    array[i + step] = array[i] - array[i + step];
                    array[i] -= array[i + step];
                    swap = true;
                }
            }
        }
    }
}
