package Stepan.arrays_codingTasks;

import java.util.Arrays;

public class JCIQ_30_SortArrayDescending {
    /*
        Sort Array Descending

        Create a method that will sort the given array in descending order (largest to smallest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

     */

    public static void main(String[] args) {

        int[] array = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
        System.out.println(Arrays.toString(reverseAndSort(array)));    // output: [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

    }

    public static int[] reverseAndSort(int[] array){   // reversed bubble sorting method.

        for (int i = array.length-1; 0 < i; i--) {

            for (int j = array.length-1-i; 0 <= j; j--) {

                if(array[j]<array[j+1]){                // compares current element with the next element.

                    array[j] = array[j] ^ array[j+1];
                    array[j+1] = array[j] ^ array[j+1]; // assigns the next element as current element.
                    array[j] = array[j] ^ array[j+1];   // assigns current element as the next element.

                }

            }

        }

        return array;   // returns reversed sorted "array".

    }

}
