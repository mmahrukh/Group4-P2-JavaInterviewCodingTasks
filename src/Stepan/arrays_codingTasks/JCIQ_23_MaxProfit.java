package Stepan.arrays_codingTasks;

public class JCIQ_23_MaxProfit {
    /*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it
        on one day and selling on another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */

    public static void main(String[] args) {

        int[] array = {8,3,3,1,4,9,12,11};
        System.out.println(maxProfit(array));   // output: 11

    }

    public static int maxProfit(int[] array){

        int maxValue = 0;   // stores max value.

        for (int i = 0; i < array.length-1; i++) {          // takes one element.

            for (int j = i+1; j < array.length-1; j++) {    // takes another element.

                if(array[j]-array[i]>maxValue){             // compares the profit.

                    maxValue = array[j]-array[i];           // assigns the profit.

                }

            }

        }

        return maxValue;    // returns profit.

    }

}
