package Elena.numbers_codingTasks;

public class JCIQ_16_LovelyNumber {
    /*
        Lovely Number

        Create a method that will count the lovely numbers with the given range.
        The parameters a and b are defined as the lower and upper bounds.
        A number is lovely if it contains fewer than three instances of any distinct digit

        Example of lovely numbers: 0, 100, 1232 and 9922
        Example of non-lovely numbers: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        parameter: int, int
            A and B will be within the range: 0 - 100,000
        return: int

        Ex:
            Given A = 0, B = 0, your function should return 1, because o is
        lovely.

            Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.

            Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
     */

        public static int countLovelyNumbers(int A, int B) {
            int count = 0;

            for (int num = A; num <= B; num++) {
                if (isLovely(num)) {
                    count++;
                }
            }

            return count;
        }

        private static boolean isLovely(int num) {
            int[] digitCount = new int[10];  // Array to store counts of each digit

            while (num > 0) {
                int digit = num % 10;
                digitCount[digit]++;
                if (digitCount[digit] == 3) {  // If any digit appears 3 or more times
                    return false;
                }
                num /= 10;
            }

            return true;  // Number is lovely if no digit appears 3 or more times
        }

        public static void main(String[] args) {
            System.out.println(countLovelyNumbers(0, 0));          // Output: 1
            System.out.println(countLovelyNumbers(1, 111));        // Output: 110
            System.out.println(countLovelyNumbers(100000, 100000));  // Output: 0
        }
    }