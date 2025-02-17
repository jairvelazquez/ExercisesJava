package org.example.Algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci Position: ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();

        //for (int i = 0; i <= position; i++) { // Imprime los primeros 10 números de Fibonacci
            System.out.println(fibonacci(position));



    }

    public static int fibonacci(int position) {
        System.out.println("Llamando: fibonacci(" + position + ")");
        if (position <= 1) {
            System.out.println("Retornando: " + position + " (caso base)");
            System.out.println("suma: " + position);

            return position;
        }
        int resultado = fibonacci(position - 1) + fibonacci(position - 2); // Llamadas recursivas
        System.out.println("Resultado de fibonacci(" + position + ") = " + resultado);
        return resultado;

    }

}




