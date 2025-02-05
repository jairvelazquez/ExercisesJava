package org.example.cycles;

import org.example.utils.KeyboardEntry;

public class While {
    public static void main(String[] args) {
        /* while exercise: secret number
         */
        final int SECRET_NUMBER = 50;
        int userNumber=0;

        userNumber= KeyboardEntry.enterInt("Enter a random number ");

        while (userNumber!=SECRET_NUMBER) {
            if (userNumber<=SECRET_NUMBER) {
                System.out.println("The secret number its greater ");
            }
            else {
                System.out.println("The secret number its lower ");
            }

            userNumber= KeyboardEntry.enterInt("Enter a random number ");
        }


        System.out.println("Great! the secret number its " +SECRET_NUMBER);

    }
}
