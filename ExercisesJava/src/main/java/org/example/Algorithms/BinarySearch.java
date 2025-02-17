package org.example.Algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main (String  [] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] array = {2,4,6,8,10,12,14,16,18,20} ;
        System.out.println("Enter a number to search: ");
        int number = scanner.nextInt();
        int found_number = binarySearch(array, number, 0, array.length-1);
        System.out.println(number+ "= "+ found_number);
    }

    public static int binarySearch (int [] array, int number_to_search,int left, int right) throws Exception {
        int mid=left+(right-left)/2;
        System.out.println("number to search: "+number_to_search + "left:  "+ left+"right: "+ right+ "mid: "+ mid);

         if (left>right){
             throw new Exception("Number not found");
         }
        if (array [mid]==number_to_search){
             return number_to_search;
         }
         else if (array [mid]<number_to_search){
             return binarySearch(array, number_to_search, mid+1, right);
         }
         else{
             return binarySearch(array, number_to_search, left, mid-1);

         }
    }
}
