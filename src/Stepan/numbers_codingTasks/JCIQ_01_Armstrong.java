package Stepan.numbers_codingTasks;

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
 */ // description of the task

    public static void main(String[] args) {

        System.out.println(isNarcissisticInteger(153));  // true
        System.out.println(isNarcissisticInteger(371));  // true
        System.out.println(isNarcissisticInteger(9474)); // true
        System.out.println(isNarcissisticInteger(9475)); // false
        System.out.println(isNarcissisticInteger(123));  // false

    }

/*
Test data:
153 -> true
371 -> true
9474 -> true
9475 -> false
123 -> false
 */ // test data

    public static boolean isNarcissisticInteger(int number){

        String stringNumbers = ""+number;               // gets String number.
        int length = stringNumbers.length();            // gets length of number.
        int isArmstrong = 0;                            // stores future result.
        Integer[] storeNumbers = new Integer[length];   // stores numbers raised to a power.


        for (int i = 0; i < length; i++) { // gets each numeral from the number

            int numeral = Character.getNumericValue(stringNumbers.charAt(i));   // convert a char into an integer.

            storeNumbers[i] = (int) Math.pow( numeral, length );                // raises a number to the power of "length" value.

        }

        for (Integer each : storeNumbers) { // gets each element from the Array.

            isArmstrong+=each;              // increments each element into the result "isArmstrong".

        }

        return number==isArmstrong;         // returns boolean result.

    } // returns boolean if the numbers is narcissistic number

}