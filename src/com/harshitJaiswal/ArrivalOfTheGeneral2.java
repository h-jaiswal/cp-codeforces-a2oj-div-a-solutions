package com.harshitJaiswal;

import java.util.Arrays;
import java.util.Scanner;

// Wrong answer on test case 14, maybe wrong approach

public class ArrivalOfTheGeneral2 {

    public static int f(int[] val) {

        int count = 0;
        int n = val.length;

        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < n; i++) {
            if (val[i] <= min) {
                min = val[i];
                minIndex = i;
            }
        }

        for (int i = minIndex; i < n - 1; i++) {
            swap(val, i, i + 1);
            count++;
        }

        int max = Integer.MIN_VALUE, maxIndex = -1;

        for (int i = n - 1; i > 0; i--) {
            if (val[i] >= max) {
                max = val[i];
                maxIndex = i;
            }
        }

        for (int i = maxIndex; i > 0; i--) {
            swap(val, i, i - 1);
            count++;
        }

        return count;
    }

    public static int f2(int[] val) {

        int count = 0;
        int n = val.length;

        int max = Integer.MIN_VALUE, maxIndex = -1;

        for (int i = n - 1; i > 0; i--) {
            if (val[i] >= max) {
                max = val[i];
                maxIndex = i;
            }
        }


        for (int i = maxIndex; i > 0; i--) {
            swap(val, i, i - 1);

            count++;
        }

        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < n; i++) {
            if (val[i] <= min) {
                min = val[i];
                minIndex = i;
            }
        }

        for (int i = minIndex; i < n - 1; i++) {
            swap(val, i, i + 1);
            count++;
        }

        return count;
    }

    public static void swap(int[] val, int i, int j) {
        int temp = val[i];
        val[i] = val[j];
        val[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

//        Find last index of minimum value and swap it to the last index by consecutive swapping
//        Find the first index of the maximum value and swap it to the first index by consecutive swapping

        int count1 = f(val.clone());
        int count2 = f2(val.clone());

        if( val[0] == Arrays.stream(val).max().getAsInt() && val[n-1] == Arrays.stream(val).min().getAsInt()) {
            System.out.println(0);
            scanner.close();
            return;
        }
        System.out.println(Math.min(count1, count2));

        scanner.close();

    }
}
