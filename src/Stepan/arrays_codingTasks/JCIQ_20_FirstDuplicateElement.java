package Stepan.arrays_codingTasks;

import java.util.HashMap;

public class JCIQ_20_FirstDuplicateElement {
     /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */

    public static void main(String[] args) {

        int[] array = {3, 5, 1, 5, -1, 5, 3};   // output: 3

        System.out.println(amountOfDuplicates(array));

    }

    public static int amountOfDuplicates(int[] array){

        HashMap<Integer, Integer> warehouse = new HashMap<>();  // stores each int and its duplicate amounts.
        int amount = 0; // sums amount of duplicates.

        for (int each : array) {    // iterates through the array.

            warehouse.put(each, warehouse.getOrDefault(each, -1)+1);    // adds each element and updates its duplicates.

        }

        for(int each : warehouse.values()){ // iterates through the Map.

            if(each>=1){    // checks if it's duplicate.

                amount+=each;   // sums every duplicate match.

            }

        }

        return amount;  // returns the sum.

    }

}
