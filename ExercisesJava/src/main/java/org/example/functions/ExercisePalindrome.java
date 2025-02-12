package org.example.functions;

import java.util.Scanner;

public class ExercisePalindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome detector 1.0 by Itequiya");
        System.out.println("Give me a word: ");
        String word = scanner.nextLine();
        //char[] wordArray = word.toCharArray();
        char[] wordArray =word.toCharArray();

 if (isPalindrome(wordArray)){
     System.out.println("The word is a palindrome");
 } else {
     System.out.println("The word is not a palindrome");
 }
    }

    static boolean isPalindrome (char[] wordArray){
        int i=wordArray.length-1;
        int a = 0;

        while (a<i) {
            if (wordArray[i] != wordArray[a]) {
                return false;
            }
            a++;
            i--;
        }
        return true;

    }
}
