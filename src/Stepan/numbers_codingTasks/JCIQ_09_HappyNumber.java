package Stepan.numbers_codingTasks;

import java.util.HashSet;
import java.util.Set;

public class JCIQ_09_HappyNumber {

    /*
        Happy Number

        Create a method that will check if the given number is a happy or an unhappy number

        A happy number is when the sum of its digits squared eventually result in 1.
        Hint: Read each digit of the number, square the number and take the number for the next number to be checked

        An unhappy number is when the numbers consistently end up as 4

        Ex:
            32
            Happy
            Breakdown:
                32 -> 3^2 + 2^2 = 9 + 4 = 13
                13 -> 1^2 + 3^2 = 1 + 9 = 10
                10 -> 1^2 + 0^2 = 1 + 0 = 1

        Ex:
            42
            Unhappy
            Breakdown:
                42 -> 4^2 + 2^2 = 16 + 4 = 20
                20 -> 2^2 + 0^2 = 4 + 0 = 4
     */ // task explanation.

    public static void main(String[] args) {

        System.out.println("Is 32 happy number: "+isHappy(32));         // true.
        System.out.println("Is 42 happy number: "+isHappy(42));         // false.
        System.out.println("Is 0 happy number: "+isHappy(0));           // false.
        System.out.println("Is -32 happy number: "+isHappy(-32));       // false.
        System.out.println("Is 123123 happy number: "+isHappy(123123)); // true.

    }

    public static boolean isHappy(int input){ // provides input number for a recursion.

        return isHappy(input, new HashSet<>()); // provides new HashSet object with provided number into the recursion.

    }

    public static boolean isHappy(int number, Set<Integer> count){ // calculates whether a number is Happy Number.

        if(number==1){                      // base case true if number equals 1.

            return true;

        }else if(count.contains(number)){   // base case false if number is already in the HashSet, hence infinite loop.

            return false;

        }else{                              // else cycle goes on.

            count.add(number);              // adds new number into the HashSet "count".

            int newNumber = 0;              // variable to store the calculations below.

            while(number>0){

                int numeral = number%10;    // temp variable represents the most right digit from the number.
                newNumber+=numeral*numeral; // updates value for the newNumber after numeral square multiplication
                number/=10;                 // reduces the number by cutting out the most right digit from it...
                                            // ... and avoids infinite loop.
            }

            return isHappy(newNumber, count);   // calls another recursion but with updated values...
                                                // ... providing the calculation result as int and current HashSet object.

        }

    }

}
