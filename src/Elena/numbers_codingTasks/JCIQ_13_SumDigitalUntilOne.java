package Elena.numbers_codingTasks;

public class JCIQ_13_SumDigitalUntilOne {
     /*
        Sum All Digits Until One Digit

        Create a method to calculate the sum of all the digits until there is only one digit left.
        The sum becomes the next number
            parameter: int
            return: int

        Ex:
        input: 45659
        output:
                2

        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2

        Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2

     */

        public static int sumDigitsUntilOne(int num) {
            while (num >= 10) {
                num = sumDigits(num);
            }
            return num;
        }

        private static int sumDigits(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // Get the last digit and add it to sum
                num /= 10;        // Remove the last digit
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sumDigitsUntilOne(45659));  // Output: 2
            System.out.println(sumDigitsUntilOne(3244));   // Output: 4
            System.out.println(sumDigitsUntilOne(24536));  // Output: 2
        }
    }