package org.example.arrays;

public class ArraysExercise {


    public static void main(String[] args){

        /* Reverse word:
            Example
            char array: telefono
            Expected output: onofelet (can be a string or a for printing all the elements of a new char array)
     */
        char[] telefono = { 't', 'e', 'l', 'e', 'f', 'o', 'n', 'o' };

        for ( int i=telefono.length-1; i>=0; i--){

            System.out.print(telefono[i]);
        }

        //Write the solution in here
        //Tip, its easier to create a string  variable and concatenate (+ symbol) every character.
    }
}
