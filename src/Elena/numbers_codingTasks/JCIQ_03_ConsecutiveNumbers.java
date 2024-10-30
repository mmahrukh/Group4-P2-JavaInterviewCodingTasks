package Elena.numbers_codingTasks;

public class JCIQ_03_ConsecutiveNumbers {
     /*
        Consecutive Numbers

        Create a method to print consecutive numbers from 1 to N,
        each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the
        word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers
        it should be replaced by a concatenation of the respective words.
        The given N value will be a positive integer.

            parameter: int
            return: void

        Example of a number being divisible by 2 & 3:
            when the number is 6 the output should be CodilityTest because 6 is divisible by 2 and 3

        Example of a number being divisible by 2 & 5:
            when the number is 10 the output should be Codi1ityCoders because 10 is divisible by 2 and 5

        Ex:
            input: 16
            output:
                1
                Codility
                Test
                Codility
                Coders
                CodilityTest
                7
                Codility
                Test
                CodilityCoders
                11
                CodilityTest
                13
                Codility
                TestCoders
                Codility
     */

    public static void printConsecutiveNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String result = "";

            //Check divisibility and concatenate the respective words
            if (i % 2 == 0) {
                result = "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }

            //If none of the conditions were met, just print the number
            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result); //Print the concatenated words
            }
        }

    }

    public static void main(String[] args) {
        //Test case: Print numbers from 1 to 16
        printConsecutiveNumbers(16);
    }
}