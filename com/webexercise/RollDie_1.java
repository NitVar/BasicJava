package com.webexercise;

/*Write a program RollDie.java that generates the result of rolling a fair six-sided die (an integer between 1 and 6).*/
class RollDie_1 {
    public static void main(String[] args) {
        int roll = (int) (Math.random() * 6) + 1;

        System.out.println(roll);

    }
}
