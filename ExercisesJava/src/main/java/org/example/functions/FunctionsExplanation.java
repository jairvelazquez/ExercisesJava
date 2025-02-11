package org.example.functions;

public class FunctionsExplanation {
    public static void main(String[] args){

        int number = 1;
        System.out.println("number" + number+ "is even"+ isEven(number));
        number = addOne(number);
        System.out.println("number" + number+ "is even"+ isEven(number));
        number = addOne(number);
        System.out.println("number" + number+ "is even"+ isEven(number));
    }








    static int addOne(int number){
        number++;
        return number;
    }

    static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //metodos, funciones

    //tipo de dato de retorno
    //nombre
    //parametros - argumentos


    //retorno cualquier tipo de dato
    //void - no retorna nada
}
