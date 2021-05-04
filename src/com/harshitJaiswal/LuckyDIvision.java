package com.harshitJaiswal;

import java.util.Scanner;

public class LuckyDIvision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] v = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

        for (int j : v) {
            if (j > n)
                break;
            if (n % j == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

        scanner.close();
    }
}
