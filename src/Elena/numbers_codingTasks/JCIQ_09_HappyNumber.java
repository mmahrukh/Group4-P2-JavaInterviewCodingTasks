package Elena.numbers_codingTasks;

import java.util.HashSet;

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
                13 -> 1^2 + 3^3 = 1 + 9 = 10
                10 -> 1^2 + 0^2 = 1 + 0 = 1

        Ex:
            42
            Unhappy
            Breakdown:
                42 -> 4^2 + 2^2 = 16 + 4 = 20
                20 -> 2^2 + 0^2 = 4 + 0 = 4
     */

    public static String checkHappyNumber(int n) {
        // Set to track seen numbers
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && n != 4) {
            // If we see the number again, it's unhappy
            if (seenNumbers.contains(n)) {
                return "Unhappy";
            }
            seenNumbers.add(n);

            // Calculate the sum of the squares of its digits
            n = sumOfSquares(n);
        }

        return (n == 1) ? "Happy" : "Unhappy";
    }

    // Helper method to calculate the sum of squares of digits
    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Get last digit
            sum += digit * digit; // Square the digit and add to sum
            num /= 10; // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkHappyNumber(32)); // Output: Happy
        System.out.println(checkHappyNumber(42)); // Output: Unhappy
    }
}