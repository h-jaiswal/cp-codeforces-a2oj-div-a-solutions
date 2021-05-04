package com.harshitJaiswal;

//https://codeforces.com/problemset/problem/112/A

import java.util.Scanner;

public class PetyaAndStrings {
    public static String s1, s2;

    public static String ans(Scanner scanner) {
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        int out = 0; // 1 if s1 is lexicographically max otherwise -1 if small and 0 if equal

        char c1, c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = (char) (s1.charAt(i) > 90 ? s1.charAt(i) - 32 : s1.charAt(i));
            c2 = (char) (s2.charAt(i) > 90 ? s2.charAt(i) - 32 : s2.charAt(i));
            if (c1 > c2) {
                out = 1;
                break;
            } else if (c1 < c2) {
                out = -1;
                break;
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
