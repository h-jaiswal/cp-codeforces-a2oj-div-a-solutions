package com.harshitJaiswal;

// https://codeforces.com/problemset/problem/160/A

// TODO: Any other way than sorting & brute force?

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.hasNextInt() ? scanner.nextInt() : 0;
        scanner.nextLine();

        List<Integer> v = new ArrayList<>(n);   // values/denominations of n coins

        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
        }

        v.sort(Integer::compareTo); // Ascending order

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += v.get(i);
        }

        int k1 = 0; // share of first twin

//      Reverse iteration to process in descending order of sort
        for (int i = n - 1; i > -1; i--) {
            k1 += v.get(i);

            if( k1 > sum/2) {
                System.out.println(n-i);  // num of coins taken by k1
                break;
            }
        }
    }
}
