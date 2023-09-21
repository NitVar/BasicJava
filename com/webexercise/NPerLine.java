package com.webexercise;

import java.util.Scanner;

/*Write a program NPerLine.java that takes an integer command-line argument n and prints the integers
from 10 to 99 with n integers per line.
   */
public class NPerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        int num = 10;
        int cnt = 0;
        while (num <= 99)
        {
            System.out.print(num + " ");
            cnt++;
            if (cnt == n){
                System.out.println();
                cnt = 0;
            }
                num++;
        }
    }
}
