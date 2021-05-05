package com.harshitJaiswal;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/263/A

//        5 by 5 matrix with only 1 and all other cells have 0
//        cell_value ^ 1 is 0 if it cell_value is 1

//        cell_value ^ 0 is 1 if it cell_value is 1

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cell_value, destination_row_index = 2, destination_col_index = 2;
        int moves = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cell_value = scanner.nextInt();
                if (cell_value == 1) {
                    moves = Math.abs(i - destination_row_index) + Math.abs(j - destination_col_index);
//                    System.out.println(moves);
                }
            }
        }
        System.out.println(moves);

        scanner.close();
    }
}
