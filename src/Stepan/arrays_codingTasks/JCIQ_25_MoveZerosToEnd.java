package Stepan.arrays_codingTasks;

import java.util.Arrays;

public class JCIQ_25_MoveZerosToEnd {
     /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */

    public static void main(String[] args) {

        int[] array = {5, 0, 2, 0, 0, 1, 0, 23};

        System.out.println((Arrays.toString(sortedArray(array))));

    }

    public static int[] sortedArray(int[] array){

        int[] sortedArray = new int[array.length];

        for (int i = 0, j = 0, k = 0; i < array.length; i++) {

            if(array[i]==0){

                sortedArray[sortedArray.length-1-j] = 0;    // adds zeros to the end of sortedArray.
                j++;                                        // updates index for the zero positions.

            }else{

                sortedArray[k] = array[i];                  // adds non-zeros to the beginning of sortedArray.
                k++;                                        // updates index for the non-zeros indexes.

            }

        }

        return sortedArray;

    }

}
