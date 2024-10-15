package Stepan.arrays_codingTasks;

public class JCIQ_28_SecondLargestNumber {
    /*
        Second Largest Number

        Create a method that finds the second largest number in the given array.
        The second largest must be different from the largest number.

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                5

     */

    public static void main(String[] args) {

        int[] array = {3, 4, 5, 1, 2, 6};
        System.out.println(secondBiggest(array));

    }

    public static int secondBiggest(int[] array){

        int biggestNumber = Integer.MIN_VALUE;

        for (int each : array) {            // locates the biggest number in the Array.

            if (biggestNumber < each) {
                biggestNumber = each;
            }

        }

        int secondBiggestNumber = Integer.MIN_VALUE;

        for (int each : array) {            // locates the second-biggest number in the Array.

            if (secondBiggestNumber < each && each != biggestNumber) {
                secondBiggestNumber = each;
            }

        }

        return secondBiggestNumber; // returns the econd-biggest number in the Array.

    }

}
