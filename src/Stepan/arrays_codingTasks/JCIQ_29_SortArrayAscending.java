package Stepan.arrays_codingTasks;

import java.util.Arrays;

public class JCIQ_29_SortArrayAscending {
    /*
        Sort Array Ascending

        Create a method that will sort the given array in ascending order (smallest to largest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [-1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 8]

     */

    public static void main(String[] args) {

        int[] array = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
        System.out.println(Arrays.toString(sortedArray(array)));    // output: [-1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 8]

    }

    public static int[] sortedArray(int[] array){   // bubble sorting method.

        for (int i = 0; i < array.length-1; i++) {

            for (int j = 0; j < array.length-1-i; j++) {

                if(array[j]>array[j+1]){                // compares current element with the next element.

                    array[j] = array[j] ^ array[j+1];
                    array[j+1] = array[j] ^ array[j+1]; // assigns the next element as current element.
                    array[j] = array[j] ^ array[j+1];   // assigns current element as the next element.

                }

            }

        }

        return array;   // returns sorted "array".

    }

}
