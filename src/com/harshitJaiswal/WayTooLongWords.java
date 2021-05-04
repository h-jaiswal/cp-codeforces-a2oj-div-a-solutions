package com.harshitJaiswal;

// Problem - https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class WayTooLongWords {
    public static String input;

    public static String ans(Scanner scanner) {
        input = scanner.nextLine();

        if (input.length() > 10)
            return ( input.charAt(0) + String.valueOf(input.length() - 2) + input.charAt(input.length() - 1));

        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.hasNextLong() ? scanner.nextLong() : 0;
        scanner.nextLine();   // ignoring

        String out = "";
        while (t > 0) {
            out += ans(scanner) + "\n";
            t--;
        }
        System.out.print(out);
        scanner.close();
    }
}
