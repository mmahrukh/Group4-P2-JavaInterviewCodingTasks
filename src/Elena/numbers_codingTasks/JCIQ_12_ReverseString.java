package Elena.numbers_codingTasks;

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

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            // Multiply the reversed number by 10 and add the last digit of the original number
            reversedNumber = (reversedNumber * 10) + (number % 10);
            // Remove the last digit from the original number
            number = number / 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverse(1234)); // Output: 4321
        System.out.println(reverse(56789));// Output: 98765
    }
}