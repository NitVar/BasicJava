package com.webexercise;

import java.util.Scanner;

/*Modify NPerLine.java so that it prints the integers from 1 to 1000 with n integers per line. Make the integers
line up by printing the right number of spaces before an integer (e.g., three for 1-9, two for 10-99, and one for 100-999).*/
public class NPerLineModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        int num = 1;
        int cnt = 0;
        while (num <= 1000)
        {
            System.out.format("% 5d ", num);
            //System.out.print(num + " ");
            cnt++;
            if (cnt == n){
                System.out.println();
                cnt = 0;
            }
            num++;
        }
    }
}
