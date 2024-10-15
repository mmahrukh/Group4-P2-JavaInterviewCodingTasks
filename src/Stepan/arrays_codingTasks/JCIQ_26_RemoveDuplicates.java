package Stepan.arrays_codingTasks;

import java.util.Arrays;

public class JCIQ_26_RemoveDuplicates {
    /*
        Remove Duplicates

        Create a method that will remove the duplicate values from an int array
        The returning array should only have one occurrence of each number

        Ex:
            Input:
                [3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3]
            Output:
                [3, 4, 5, 1, 2, 6]

     */

    public static void main(String[] args) {
        
        int[] array = {3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3};
        System.out.println(Arrays.toString(removeDuplicates(array)));   // output: [3, 4, 5, 1, 2, 6]
        
    }
    
    public static int[] removeDuplicates(int[] array){

        StringBuilder storage = new StringBuilder();

        for (int each : array) {

            if (!storage.toString().contains("" + each)) { // verifies unique elements.

                storage.append(each).append(" ");          // adds unique elements to the "storage" with a space after.

            }

        }

        String[] stringNumbers = storage.toString().split(" "); // adds each String number to String[]
        int[] sortedArray = new int[stringNumbers.length];            // sorted Array.

        for (int i = 0; i < stringNumbers.length; i++) {

            sortedArray[i]= Integer.parseInt(stringNumbers[i]); // converts each String number into integer number and adds.

        }

        return sortedArray; // returns the sorted Array.

    }
    
}
