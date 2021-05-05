package com.harshitJaiswal;

// https://codeforces.com/problemset/problem/136A

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[scanner.nextInt() - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }

        scanner.close();
    }
}
