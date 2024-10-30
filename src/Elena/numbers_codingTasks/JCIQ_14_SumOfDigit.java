package Elena.numbers_codingTasks;

public class JCIQ_14_SumOfDigit {
    /*
        Sum Of Digits Of Integer

        Create a method that will calculate the sum of the number's digits. Do not use any String manipulation
            parameter: int
            return: int

        Ex:
            input: 123
            output: 6
            -> 1 + 2 + 3

        Test data:
            11111 -> 1 + 1 + 1 + 1 + 1 = 5
            54321 -> 5 + 4 + 3 + 2 + 1 = 15
            214 -> 2 + 1 + 4 = 7
     */

    public static int sumDigits(int n) {
        int sum = 0;

        // Loop to extract digits and add them to sum
        while (n > 0) {
            sum += n % 10; // Add the last digit to the sum
            n /= 10;       // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDigits(123));   // 6
        System.out.println(sumDigits(11111)); // 5
        System.out.println(sumDigits(54321)); // 15
        System.out.println(sumDigits(214));   // 7
    }
}