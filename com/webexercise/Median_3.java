package com.webexercise;

/*Write a program that takes five integer command-line arguments and prints the median (the third largest one).*/
class Median_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c =  Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e =  Integer.parseInt(args[4]);
        if (a>b && a>c && a < d && a < e)
            System.out.println(a);
        else if (b>a && b>c && b < d && b < e)
            System.out.println(b);
        else if (c>a && c>b && c < d && c < e)
            System.out.println(c);
        else if (d>a && d>b && d < c && d < e)
            System.out.println(d);
        else
            System.out.println(e);
    }
}
