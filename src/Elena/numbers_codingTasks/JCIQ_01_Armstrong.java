package Elena.numbers_codingTasks;

public class JCIQ_01_Armstrong {
    public static boolean isArmstrong(int number) {
        int originalNumber = number; // Save the original number
        int numDigits = 0;
        int sum = 0;

        //Calculate the number of digits
        int temp = number;
        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }

        temp = number; //Reset temp to the original number

        // Calculate the sum of each digit raised to the power of numDigits
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            sum += (int) Math.pow(digit, numDigits); // Raise the digit to the power of numDigits and add it to the sum
            temp /= 10; // Remove the last digit from temp
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        //Test cases
        System.out.println(isArmstrong(153)); //true
        System.out.println(isArmstrong(371)); //true
        System.out.println(isArmstrong(9474)); //true
        System.out.println(isArmstrong(9475)); //false
        System.out.println(isArmstrong(123)); //false
    }

}

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