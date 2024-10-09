package Mahrukh.numbers_codingTasks;

public class JCIQ_01_Armstrong {
    /*
        Armstrong

        Create a method to check if a number is an Armstrong number
            parameter: int
            return: boolean

        An Armstrong number is a number that's digits can be raised to the power of the total number of digits and
        summed to equal the original number

            -> these numbers are also called narcissistic numbers

        Ex:
            input: 153
            output: true

            the digits are 1, 5, and 3
            the calculation would be:
            1^3 + 5^3 + 3^3
                -> why is the exponent 3? because there is 3 digits in the number

            1^3 = 1 * 1 * 1 = 1
            5^3 = 5 * 5 * 5 = 125
            3^3 = 3 * 3 * 3 = 27

            1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an Armstrong number

        Test data:
            153 -> true
            371 -> true
            9474 -> true
            9475 -> false
            123 -> false
     */

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));   // true
        System.out.println(isArmstrong(371));   // true
        System.out.println(isArmstrong(9474));  // true
        System.out.println(isArmstrong(9475));  // false
        System.out.println(isArmstrong(123));  // false
    }

    public static boolean isArmstrong(int n) {

        String strNum = "" + n;
        int length = strNum.length();   // length is also the number of total digits
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int eachDigit = Integer.parseInt("" + strNum.charAt(i));
            sum += Math.pow(eachDigit, length); // each digit ^ total digits
        }

        return sum == n;   // if sum equals to the original number then it is an Armstrong number
    }
}
