package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        return x < 5;

    }

    public String getAgeGroup(int age) {
        // Replace the line below with code that returns "child" if age is less than 13,
        if (age < 13) {
            return "child";
        } else if (age < 20) {
            return "teen";
        } else {
            return "adult";
        }


    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
        return passwordLength >= 8;
    }
}
