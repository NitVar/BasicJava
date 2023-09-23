package com.webexercise;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
    int[] n = {34, 67, 13, 56 ,67};
    for (int i=0; i<n.length; i++)
    {
        boolean flag = false;
        for (int j=2; j<n[i]-1; j++)
        {
            if (n[i] % j == 0)
                flag = true;
        }
        if (!flag)
        {
            System.out.println(n[i]);
        }
    }

    }
}