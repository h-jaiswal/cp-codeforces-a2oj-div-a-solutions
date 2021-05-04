package com.harshitJaiswal;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String v = "hello";

        int j = 0;
        for (int i = 0; i < s.length() && j < 5; i++) {
            if (v.charAt(j) == s.charAt(i)) {
                j++;
            }
        }

        if (j == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
