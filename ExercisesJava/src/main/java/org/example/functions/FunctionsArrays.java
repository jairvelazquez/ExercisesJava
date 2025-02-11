package org.example.functions;

public class FunctionsArrays {
    //Imprimir los numeros del arreglo
    // Multiplicar cada valor del arreglo por tres
    //Imprimir de nuevo los numeros del arreglo
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        printArray(numbers);
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers[i] * 3;
        }
        printArray(numbers);
    }

    static void printArray(int[] numbers){
        //for each
        for(int number: numbers){
            System.out.println(number);
        }
    }





}
