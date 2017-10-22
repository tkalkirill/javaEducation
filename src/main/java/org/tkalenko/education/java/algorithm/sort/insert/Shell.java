package org.tkalenko.education.java.algorithm.sort.insert;

public class Shell extends Insert {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 2) return;
        for (int i = array.length / 2, j, k, l; i > 0; i /= 2) {
            for (j = 0; j < i; j++) {
                for (k = i + j; k < array.length; k += i) {
                    for (l = k; l > 0; l -= i) {
                        if (array[l] < array[l - i]) {
                            array[l] += array[l - i];
                            array[l - i] = array[l] - array[l - i];
                            array[l] -= array[l - i];
                        } else {
                            break;
                        }
                    }
                }
            }


        }
    }
}
