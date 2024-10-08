package Mahrukh.numbers_codingTasks;

import static java.lang.Integer.parseInt;

public class JCIQ_12_ReverseString {
    /*
        Reverse Integer

        Create a method to reverse the given number
            parameter: int
            return: int

        Reverse using only numbers, no Strings

        Assume the given number is a positive integer

        Ex:
            input: 1234
            output: 4321
     */

    public static void main(String[] args) {
        System.out.println("reverseInteger(1234) = " + reverseInteger(1234));
        System.out.println("reverseInteger(-123) = " + reverseInteger(-123));
    }

    public static int reverseInteger(int num) {

        String n = String.valueOf(num);                         // coverts int to string
        String reverseStringInt = "";                           // create an empty string to for reversed version

        if (num < 0){

            for (int i = n.length()-1; i >= 1 ; i--) {          // reversed for loop
                reverseStringInt += n.charAt(i);                // concatenate reversed chars into reversed string
            }
            reverseStringInt = "-" + reverseStringInt;          // concatenate "-" into revered integer String

        } else {
            for (int i = n.length() - 1; i >= 0; i--) {
                reverseStringInt += n.charAt(i);
            }
        }

        return parseInt(reverseStringInt);                    // returns converted reversed int

    }

}
