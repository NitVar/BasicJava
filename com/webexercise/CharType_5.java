package com.webexercise;
/*Initialize a character variable in a program and if the value is alphabet then print
"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
Character"*/
import  java.util.Scanner;
public class CharType_5 {
    public static void main(String[] args) {
        ////
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.nextLine().toCharArray()[0];

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");

    }
}
