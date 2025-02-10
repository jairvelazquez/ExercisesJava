package org.example.cycles;

import java.sql.SQLOutput;

public class For1 {
    public static void main(String[] args){
        /* print evens */
        for (int i=0; i<101; i++){
            if (i%2==0){
                System.out.println(i);
            }

        }
        /* print odds */

        for (int i=0; i<101; i++){
            if (i%2!=0){
                System.out.println(i);
            }

        }
    }
}
