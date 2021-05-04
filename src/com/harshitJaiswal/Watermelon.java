package com.harshitJaiswal;

// Problem - https://codeforces.com/problemset/problem/4/A

/*
*
* Concept -
* even + even = even
*
* odd + odd = even
* 1 + 1 = 2
*
* Every even number can be made up of either of both odd + odd or even + even
* except 2 which can be made up of odd + odd combination only ( 1 + 1 = 2 )
*
* check
* Other related Concept -
*
* odd + even = odd
*
* odd x odd = odd
* odd x even = even
* even x even = even
*
*/

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w;
        w = scanner.nextInt();  // 1<= w <= 100

        if (w == 2 || w%2 != 0) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
