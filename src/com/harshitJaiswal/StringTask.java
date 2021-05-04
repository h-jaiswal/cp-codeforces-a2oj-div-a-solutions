package com.harshitJaiswal;

//https://codeforces.com/problemset/problem/118/A

import java.util.Scanner;

public class StringTask {
    public static String input, out = "";

    public static String ans() {
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (!(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' || input.charAt(i) == 'Y' || input.charAt(i) == 'y')) {
                out += "." + String.valueOf(input.charAt(i)).toLowerCase();
            }
        }

        return out;
    }
    public static void main(String[] args) {
        System.out.println(ans());
    }
}
