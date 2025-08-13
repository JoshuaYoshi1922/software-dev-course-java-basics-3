package org.example;

public class LoopExercises {
    public int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        int total = 0;
        int i = 1;
        while ( i < n) {
            total += i;
            i++;
            if (total % 2 ==0 ) {
                break;
            }
            // Replace the line below with code that returns the sum of the numbers from 1 to n
            // but stops adding when the sum is even
            // (use a while loop with a sum variable and a counter variable)

        }
        return total;
    }

}
