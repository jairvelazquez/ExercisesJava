package org.example;

import org.example.utils.KeyboardEntry;

public class Conditionals {
    //if
    //else if
    // else
    // switch
    /*
    90 - 100 → A
    80 - 89 → B
    70 - 79 → C
    60 - 69 → D
    Below 60 → F

     */
    public static void main(String[] args) {
        int grade= KeyboardEntry.enterInt("Score: ");

        if (grade >100){
            System.out.println("Invalid Score" );
        }

        else if (grade >= 90) {
            System.out.println("Grade: A" );
        }

       else if (grade > 79 ) {
            System.out.println("Grade: B");
        }
       else if (grade > 69 ) {
            System.out.println("Grade: C");
        }
       else if (grade > 59 ){
            System.out.println("Grade: D");
        }
       else {
            System.out.println("Grade: F fatality");
        }


    }
}
