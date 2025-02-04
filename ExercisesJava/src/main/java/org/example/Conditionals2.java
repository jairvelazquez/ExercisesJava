package org.example;

import org.example.utils.KeyboardEntry;

public class Conditionals2 {
    public static void main(String[] args){

        /*
        Leap Year Checker (if-else)
Write a program that determines if a year is a leap year. A year is a leap year if:

It is divisible by 4.
But if it is divisible by 100, it must also be divisible by 400.

         */
        int year = KeyboardEntry.enterInt("Enter a year:");
        int quotient;
        boolean leap = false;


       if (year%4==0){

           if (year%100== 0){

               if (year%400==0){
                   leap=true;
               }
                else {
                    leap=false;
                }
           }
           else{
                   leap=true;
           }
       }
       else {
          leap=false;
       }
       if (!leap){
           System.out.println(year+ " is not a leap year c:");}
       else {
           System.out.println(year+ " is a leap year :c");
       }
    }
}
