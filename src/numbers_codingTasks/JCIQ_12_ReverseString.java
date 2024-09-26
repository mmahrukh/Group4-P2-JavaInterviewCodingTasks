package numbers_codingTasks;

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
    }

    public static int reverseInteger(int num) {

        String n = ""+ num;
        String reverse = "";

        for(int i = n.length()-1; i >= 0; i-- ){
            reverse += n.charAt(i);
        }
        return parseInt(reverse);
    }
}
