package Stepan.arrays_codingTasks;

public class JCIQ_18_MaxNumber {
     /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */

    public static void main(String[] args) {

        int[] array = {3, 5, 1, 5, -1, 5};

        System.out.println(arrayMax(array));    // output: 5

    }

    public static int arrayMax(int[] array){

        int maxValue = Integer.MIN_VALUE;   // the most minimum integer value.

        for (int each : array) {    // iterates through the array.

            if(each>maxValue){      // compares current element with the int maxValue.

                maxValue=each;      // if true, updates it.

            }

        }

        return maxValue;    // returns.

    }


}
