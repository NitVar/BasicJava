package com.webexercise;

/*
Write a program that takes three integer command-line arguments a, b, and c
and print the number of distinct values (1, 2, or 3) among a, b, and c.
 */
public class ThreeDistinct_2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c =  Integer.parseInt(args[2]);
        if (a==b && b==c)
            System.out.println("1");
        else if (a==b || b==c || c==a)
            System.out.println("2");
        else
            System.out.println("3");
    }
}
