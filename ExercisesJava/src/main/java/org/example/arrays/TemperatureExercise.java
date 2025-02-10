package org.example.arrays;

import java.util.Scanner;

public class TemperatureExercise {
    public static void main (String [] args){

        /* Ejercicio: Análisis de Temperaturas
Un meteorólogo necesita analizar un conjunto de temperaturas registradas durante un mes. Se te pide desarrollar un programa en Java que:

Solicite al usuario ingresar 30 temperaturas (una por cada día del mes) y las almacene en un arreglo de enteros.
Calcule y muestre:
La temperatura promedio del mes.
La temperatura más alta y la más baja registradas.
El número de días con temperatura bajo cero.
Si la temperatura promedio es menor a 15°C, mostrar un mensaje de advertencia: "¡Mes frío!".
Si la temperatura promedio es mayor a 30°C, mostrar un mensaje de advertencia: "¡Mes caluroso!".
Restricciones y Pistas:

Usa un arreglo de tamaño 30 para almacenar las temperaturas.
Usa ciclos (for) para recorrer el arreglo y hacer cálculos.
Usa condicionales (if) para encontrar máximos, mínimos y contar días bajo cero.

         */
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double sum=0;
        double average= 0;
        double maxtem=0;
        double mintem=0;
        int days=0;
        double[] temperaturas= new double[30];



        for (int i=0; i<temperaturas.length; i++){
            System.out.println("Day temperature: ");
            temperature= scanner.nextDouble();
            temperaturas[i]=temperature;

        }
        for (int i=0; i<temperaturas.length; i++){
            sum= sum+temperaturas[i];

            if (temperaturas[i]>maxtem){
                maxtem=temperaturas[i];
            }
            if (temperaturas[i]<mintem){
                mintem=temperaturas[i];
            }
            if (temperaturas[i]<0){
                days++;

            }

        }
        average=sum/30;

        if (average<15){
            System.out.println("¡Cold month!");
        }
        if (average>30){
            System.out.println("¡Hot month!");
        }
        System.out.println(average);
        System.out.println("Days under 0°: "+ days);
        System.out.println("Max temperature: "+ maxtem);
        System.out.println("Min temperature: "+ mintem);



    }
}
