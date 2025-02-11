package org.example.functions;

import java.util.Scanner;

public class FunctionReturn {
    public static void main(String[] args){

        //Formula area del rectangulo
        //base
        //altura

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la base");
        double base = scanner.nextDouble();
        System.out.println("Ingresa la altura");
        double altura = scanner.nextDouble();

        double area = calculateArea(base, altura);

        System.out.println("El area es"+ area);


    }

    //cabecera de metodo
    static double calculateArea(double base, double altura){
        return base * altura;
    }

}
