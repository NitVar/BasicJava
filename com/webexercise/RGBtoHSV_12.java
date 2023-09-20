package com.webexercise;

import java.util.Scanner;

/*Write a program RGBtoHSV.java that takes an RGB color (three integers between 0 and 255) and transforms it to an HSB
 color (three different integers between 0 and 255). Write a program HSVtoRGB.java that applies the inverse transformation.*/
class RGBtoHSV_12 {
    public static void main(String[] args) {
     int r,g,b;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter red: ");
     r = sc.nextInt();
        System.out.println("Enter green: ");
        g= sc.nextInt();
        System.out.println("Enter blue: ");
        b= sc.nextInt();

        double h = r/255.0;
        double s = g/255.0;
        double bb = b/255.0;

        System.out.println("H = " + h);
        System.out.println("S = "+ s);
        System.out.println("B = " + bb);

    }
}
