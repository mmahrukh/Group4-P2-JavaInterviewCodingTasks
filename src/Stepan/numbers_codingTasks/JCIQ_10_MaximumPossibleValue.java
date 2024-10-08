package Stepan.numbers_codingTasks;

import java.util.*;

public class JCIQ_10_MaximumPossibleValue {

     /*
        Maximum Possible Value

        Create a method that will return the maximum possible value of the given number N by
        inserting the digit '5' somewhere in the integer.

        > bounds of N: -8,000 - 8,000

        Ex:
            Given N = 268, the function should return 5268
            Given N = 670, the function should return 6750
            Given N = 0, the function should return 50
            Given N = -999, the function should return -5999
     */ // task explanation.

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println(maximumNumber(101)); // result: 5101 1051 1051 1501 1015 ... every time different.
        }

        System.out.println(maximumNumber(0));       // result: 50 every time as we cannot store "05".

    }

    public static int maximumNumber(int number){   // adds 5 to the number somewhere.

        if(number < -8_000 || number > 8_000){

            System.err.println("!!! INVALID INPUT "+number+" !!!");
            throw new InputMismatchException
                    ("Number must be greater than or equal to -8000, and less than or equal to 8000.");

        }              // throws an exception.

        int count = 0;                                          // counts digits in the number.
        List<Integer> index = new ArrayList<>();                // stores digits.
        StringBuilder sb = new StringBuilder().append(number);  // stores String equivalent of the number.

        index.add(0);           // adds first digit to comprise to complete composition, having full range of indexes.

        while(number>0){

            count++;            // updates the count which will be a random index in the future within the range.
            index.add(count);   // adds new count.
            number/=10;         // reduces the number to exit from the loop.

        }

        Collections.shuffle(index); // shuffles indexes inside.

        return Integer.parseInt(sb.insert(index.getFirst(), "5").toString());

        // insert 5 into StringBuilder's object on the position which is represented as index number from the Array...
        // ... which we shuffled previously, converting it into Integer and returning eventually.

    }

}
