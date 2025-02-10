package org.example.arrays;

public class StringModification {

    /* Reverse string: Receive a string, reverse it and return the new string
        Example
        Input: telefono
        Expected output: onofelet
        Validations:
            - if string is empty, return error message (Empty string not supported)
            - if string length is larger than 4000 return error message (Limit for converstion is 4000)

     */

    public static void main(String[] args){

        String telefono="telefono";
        System.out.println(telefono.length());
        for ( int i=telefono.length()-1; i>=0; i--){

            System.out.print(telefono.charAt(i));
        }
    }

}
