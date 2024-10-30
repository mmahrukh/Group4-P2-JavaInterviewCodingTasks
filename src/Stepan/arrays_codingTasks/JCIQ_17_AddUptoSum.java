package Stepan.arrays_codingTasks;

public class JCIQ_17_AddUptoSum {
     /*
        --Add Up to Sum--

        Given an int array and an int representing the sum number, create a program that can find the pair of numbers
        from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum
        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
     */

    public static void main(String[] args) {

        int[] array = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        int[] array1 = {10, 20, 30, 40, 50};
        int sum1 = 70;

        getPairsValue(array, sum);  // output: 20 & 50
        getPairsValue(array1, sum1);// output: 30 & 40

    }

    public static void getPairsValue(int[] array, int sum){

        StringBuilder used = new StringBuilder();   // stores used indexes.

        for (int i = 0; i < array.length; i++) {    // takes one element.

            for (int j = 0; j < array.length; j++) {// takes another element and compares with another one.

                if(array[i]+array[j]==sum){         // checks if they match the sum.

                    if(i!=j && !used.toString().contains(""+j) && !used.toString().contains(""+i)){ // checks used indexes.

                        used.append(i).append(j);   // stores used indexes, avoiding confusion.
                        System.out.println(array[i]+" & "+array[j]);    // prints out the matched pair.

                    }

                }

            }

        }

    }

}
