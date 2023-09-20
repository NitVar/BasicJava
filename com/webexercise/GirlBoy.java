package com.webexercise;

/* A couple beginning a family decides to keep having children until they have at least one of either sex.
Estimate the average number of children they will have via simulation. Also estimate the most common outcome (record the frequency counts
for 2, 3, and 4 children, and also for 5 and above). Assume that the probability p of having a boy or girl is 1/2.*/
public class GirlBoy {
    public static void main(String[] args) {
        int bc = 0, gc = 0;
        int outcome2 = 0, outcome3 = 0, outcome4 = 0, outcome5 = 0;
        for (int i=0; i<1000; i++)
        {
            while (gc <= 1 && bc <= 1)
            {
                int p  = (int)(Math.floor(Math.random() *(2) ));
                if (p == 0)
                    gc++;
                else
                    bc++;
            }
            int total = gc + bc;
            if (total == 2)
                outcome2++;
            else if (total==3)
                outcome3++;
            else if (total==4)
                outcome4++;
            else
                outcome5++;

            gc = 0;
            bc = 0;
        }
        System.out.println("Outcome 2 = " + outcome2);
        System.out.println("Outcome 3 = " + outcome3);
        System.out.println("Outcome 4 = " + outcome4);
        System.out.println("Outcome 5 = " + outcome5);
    }
}
