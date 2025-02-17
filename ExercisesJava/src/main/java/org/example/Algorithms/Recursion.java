package org.example.Algorithms;

import java.util.Scanner;

public class Recursion {


    public static void main(String[] args){

        //Factorial de 5
        //Operación matemática que consiste en multiplicar un número entero positivo por todos los enteros menores que él hasta el 1
        //El factorial de 0 es uno
        //El factorial de 1 es uno
        //El factorial de 2 es 2 (2*1)
        //El factorial de 3 es 6 (3*2*1)
        //El factorial de 4 es 24 (4*3*2*1)
        //El factorial de 5 es 120 (5*4*3*2*1)

        System.out.println("Factorial!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorialConCiclos = factorialConCiclos(number);
        int factorialRecursivo = factorialRecursivo(number);

        System.out.println("Factorial con ciclos: " +factorialConCiclos);
        System.out.println("Factorial Recursivo: " + factorialRecursivo);

    }


    public static int factorialConCiclos(int number) {
        int factorial = 1;

        for(int i=1; i<=number; i++){
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int factorialRecursivo(int number){
        // Funcion recursiva siempre tiene un Caso base, (if)
        if(number == 1){
            return 1;
        }
        //Llamada a si misma(los parametros tienen que cambiar)
        return number * factorialRecursivo(number-1);
    }

}
