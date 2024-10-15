package Stepan.arrays_codingTasks;

import java.util.Arrays;

public class JCIQ_27_ReverseArray {
     /*
        Reverse Array

        Create a method that will reverse the given array

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                [6, 2, 1, 5, 4, 3]

     */

    public static void main(String[] args) {

        int[] array = {3, 4, 5, 1, 2, 6};
        System.out.println(Arrays.toString(reverse(array)));    // output: [6, 2, 1, 5, 4, 3]

    }

    public static int[] reverse(int[] array){

        int[] reversedArray = new int[array.length];            // reversed array.

        for (int i = array.length-1, j = 0; 0 <= i; i--, j++) {

            reversedArray[j] = array[i];                        // adds each element from the end.

        }

        return reversedArray;   // return the reversed Array.

    }

}
