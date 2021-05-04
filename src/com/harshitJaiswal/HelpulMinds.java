package com.harshitJaiswal;

import java.util.Scanner;

//  https://codeforces.com/problemset/problem/339/A

public class HelpulMinds {
    public static char[] s;

    public static String ans(Scanner scanner) {
        s = scanner.nextLine().toCharArray();

        char[] out = new char[s.length];
        out[0] = '2';

        for (int i = 1; i < s.length; i += 2) {
            out[i] = '+';
            out[i+1] = '2';
        }

        int k = 0;
        int j = s.length - 1;

        for (char c : s) {
            if (c == '1') {
                out[k] = '1';
                k += 2;
            } else if (c == '3') {
                out[j] = '3';
                j -= 2;
            }
        }

        return String.valueOf(out);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ans(scanner));
        scanner.close();
    }
}
