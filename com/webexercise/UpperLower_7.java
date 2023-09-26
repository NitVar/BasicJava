package com.webexercise;
/*Write a program to convert from upper case to lower case and vice versa of an alphabet
and print the old character and new character as shown in example (Ex: a->A, M->m).*/
import java.util.Scanner;

public class UpperLower_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            System.out.println((char)(ch-32));
        else
            System.out.println((char)(ch+32));

    }
}
