package com.webexercise;
/*Initialize two character variables in a program and display the characters in alphabetical
order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
second is e O/P:a,e*/

import java.util.Scanner;

public class TwoChars_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        char c1, c2;
        System.out.println("Enter 2 char: ");
        c1 = sc.nextLine().toCharArray()[0];
        c2 = sc.nextLine().toCharArray()[0];
        if (c1>c2)
            System.out.println(c2+" , "+c1);

        else
            System.out.println(c1+" , "+c2);
    }
}
