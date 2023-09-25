package com.webexercise;

import java.util.Scanner;

/*Write a program to check if a given number is Positive, Negative, or Zero.*/
public class PositiveNegative_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num == 0)
            System.out.println("Zero");
        else if (num < 0)
            System.out.println("Negative");
        else
        System.out.println("Positive");
    }
}
