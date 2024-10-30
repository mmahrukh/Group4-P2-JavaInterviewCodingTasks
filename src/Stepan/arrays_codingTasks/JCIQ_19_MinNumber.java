package Stepan.arrays_codingTasks;

public class JCIQ_19_MinNumber {
    /*
        Min Number

        Create a method that will find and return the min number in an int array
            parameter: int[]
            return: int

        The min number is the smallest value in the array

        Ex:
            input:
                min(3, 5, 1, 5, -1, 5)
            output:
                -1
     */

    public static void main(String[] args) {

        int[] array = {3, 5, 1, 5, -1, 5};

        System.out.println(arrayMin(array));    // output: -1

    }

    public static int arrayMin(int[] array){

        int minValue = Integer.MAX_VALUE;   // the most max integer value.

        for (int each : array) {    // iterates through the array.

            if(each < minValue){      // compares current element with the int minValue.

                minValue = each;      // if true, updates it.

            }

        }

        return minValue;    // returns.

    }

}
