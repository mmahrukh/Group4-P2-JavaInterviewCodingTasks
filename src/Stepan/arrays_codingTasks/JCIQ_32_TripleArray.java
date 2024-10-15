package Stepan.arrays_codingTasks;

public class JCIQ_32_TripleArray {
    /*
        Triples Array

        Create a method that will determine if the array has a triple or not.
        A triple is when an element is repeat 3 times in a row.
        If any number is repeat 3 times in a row return false.
        If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */

    public static void main(String[] args) {

        int[] array1 = {1, 1, 2, 2, 1};
        int[] array2 = {1, 1, 2, 2, 2, 1};
        int[] array3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(array1));  // output: true.
        System.out.println(noTriples(array2));  // output: false.
        System.out.println(noTriples(array3));  // output: false.

    }

    public static boolean noTriples(int[] array){

        for (int i = 0; i < array.length-3; i++) {

            if(array[i]==array[i+1] && array[i]==array[i+2]){   // verifies if element at [i] equals to the element at [i+1]...
                                                                // ... and if element at [i] equals to the element at [i+1].
                return false;   // if there's triples, returns false.

            }

        }

        return true;    // if no triples, returns true.

    }

}
