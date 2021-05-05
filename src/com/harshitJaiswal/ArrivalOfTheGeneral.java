package com.harshitJaiswal;

// https://codeforces.com/problemset/problem/144/A

// WrongSolution

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int maxIndex = -1, minIndex = -1;

        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

//        Find first index of max value (it will be moved to first index, by consecutive swapping)
        for (int i = n - 1; i > 0; i--) {
            if (val[i] >= max) {
                max = val[i];
                maxIndex = i;
            }
        }

//        Find last index of min value (it will be moved to last index, by consecutive swapping)
        for (int i = 0; i < n; i++) {
            if (val[i] <= min) {
                min = val[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        System.out.println(maxIndex);
        System.out.println((Math.abs(n - 1 - minIndex) + Math.abs(maxIndex - 0)));

        scanner.close();
    }
}
