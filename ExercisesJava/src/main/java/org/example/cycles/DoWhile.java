package org.example.cycles;

import org.example.utils.KeyboardEntry;

public class DoWhile {
    public static void main(String[] args) {

        /*Exercise log in
         */

        final String CORRECT_PASSWORD="bebecito";
        String password="initial";

        do {
            password = KeyboardEntry.enterString("Enter Password: ");
            if (!password.equals(CORRECT_PASSWORD)){
                System.out.println("Try again");
            }

        } while(!password.equals(CORRECT_PASSWORD));

        System.out.println("Correct password");
}
}
