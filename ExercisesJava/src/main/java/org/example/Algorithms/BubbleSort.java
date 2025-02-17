package org.example.Algorithms;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {5,6,1,3};

        bubbleSort(array, array.length);

        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arrray, int n) {

        boolean sorted = false;
        int i, j, temp;
        boolean swapped;
        // Complexity O(n2)
        //Controls every iteration on all the list
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            //control every local iteration
            for (j = 0; j < n - i - 1; j++) {
                if (arrray[j] > arrray[j + 1]) {
                    System.out.println(" swap");
                    // Swap arr[j] and arr[j+1]
                    temp = arrray[j];
                    arrray[j] = arrray[j + 1];
                    arrray[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

}