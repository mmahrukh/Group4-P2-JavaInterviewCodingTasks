package Stepan.arrays_codingTasks;

import java.util.Arrays;

public class JCIQ_24_ConcatArrays {
     /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array.
        Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */

    public static void main(String[] args) {

        int[] array1 = {1, 4, 5};
        int[] array2 = {8, 12, 5, 9};
        System.out.println((Arrays.toString(concatArray(array1, array2)))); //  output: [1, 4, 5, 8, 12, 5, 9]

    }

    public static int[] concatArray(int[] array1, int[] array2){

        int[] mergedArrays = new int[array1.length+array2.length];  // new array.

        for (int i = 0, j = 0; i < mergedArrays.length; i++) {      // j for array2 indexes.

            if(i<array1.length){

                mergedArrays[i]=array1[i];  // takes elements from array1.

            }else{

                mergedArrays[i]=array2[j];  // takes elements from array2.
                j++;

            }

        }

        return mergedArrays;    // return the merged array.

    }

}
