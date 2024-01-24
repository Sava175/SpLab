package com.splab.algorithms.bigO;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class UsingArray {
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5, 7, 4, 6, 2, 56, 78, 34, 65, 77};

        for (int i = one.length - 1; i > 2; i--) {
            one[i] = one[i - 1];
        }
        one[2] = 10;
        // insertion a digit on position

        one[one.length - 1] = 10;
        //  insertion a new element in the end   (O(1))


        int element = one[7];
        System.out.println(element);
        //   getting element by index  (O(1))


        for (int i = 2; i < one.length - 1; i++) {
            one[i] = one[i + 1];
        }
        one = Arrays.copyOf(one, one.length - 1);
        // removing position by index   (O(n))


        for (int i = 0; i < one.length; i++) {
            if (one[i] == 3) {
                for (int j = i; j < one.length - 1; j++) {
                    one[j] = one[j + 1];
                }
                break;
            }
        }
        // deleting element 3   (O(n))

        Arrays.sort(one);
        int low = 0, high = one.length - 1;
        while (true) {
            int mid = (low + high) / 2;
            if (one[mid] ==5) {
                System.out.println("Element 5 you can find here by this index " + mid);
                break;
            } else if (one[mid] < 5) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // binary search of the element 4 (O(log n))





    }
}
