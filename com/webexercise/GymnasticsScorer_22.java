package com.webexercise;

import java.util.Scanner;
import java.util.Arrays;

/*. A gymnast's score is determined by a panel of 6 judges who each decide a score between 0.0 and 10.0.
 The final score is determined by discarding the high and low scores, and averaging the remaining 4. Write a program
GymnasticsScorer.java that takes 6 real command line inputs representing the 6 scores and prints their average,
after throwing out the high and low scores.*/
public class GymnasticsScorer_22 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        for (int i=0; i<scores.length; i++)
        {
            System.out.println("Enter 6 scores: ");
            Scanner sc = new Scanner(System.in);
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        int sum = 0;
        for (int i=1; i<scores.length-1; i++)
        {
            sum = sum + scores[i] ;
        }
        double avg = sum / 4.0;
        System.out.println(avg);
    }
}
