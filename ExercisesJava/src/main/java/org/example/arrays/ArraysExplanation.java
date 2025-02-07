package org.example.arrays;

public class ArraysExplanation {

    public static void main(String[] args){

        /*
            An array is a way to store multiple values of the same type in a single variable.
            Think of it like a row of lockers, where each locker has a number (its index) and can store something.

            Arrays are static structures, this means that the size of the array is determined from the begininig
            and memory is reserved for the variable.
            There are
         */

        //Declaration
        int[] numbers;
        numbers = new int[5];
        int[] numbers2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        /* Usage
        System.out.println(numbers2[1]);//This will print 20 as arrays start from zero
        System.out.println(numbers2[0]);//This will print 10
        System.out.println(numbers2[9]); //This will fail as there is no index 10 of the array
        System.out.println(numbers2.length); //This will print the size of the array

        You can also modify the value of any element of the array
        numbers2[0] = 5; //now instead of 10 the first value is 5
        System.out.println(numbers2[0]); //This will print 10 */

        for (int i=0; i<numbers2.length; i++){
            System.out.println(numbers2[i]);
        }

        //Create a for cycle to print all numbers of the array


    }

}
