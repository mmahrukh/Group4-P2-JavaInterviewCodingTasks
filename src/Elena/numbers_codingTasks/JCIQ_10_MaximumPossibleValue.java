package Elena.numbers_codingTasks;

public class JCIQ_10_MaximumPossibleValue {
     /*
        Maximum Possible Value

        Create a method that will return the maximum possible value of the given number N by
        inserting the digit '5' somewhere in the integer.

        > bounds of N: -8,000 - 8,000

        Ex:
            Given N = 268, the function should return 5268
            Given N = 670, the function should return 6750
            Given N = 0, the function should return 50
            Given N = -999, the function should return -5999
     */

    public static int insertFive(int n) {
        int maxValue = n;  // Initially set the maximum value to the original number
        int currentPosition = 1;

        // Loop through all positions to try inserting '5'
        while (n / currentPosition != 0 || currentPosition == 1) {
            // Split the number and insert '5' at the current position
            int newNumber = (n / currentPosition) * (currentPosition * 10) + 5 * currentPosition + (n % currentPosition);

            // Update the maximum value if the new number is larger
            if (newNumber > maxValue) {
                maxValue = newNumber;
            }

            // Move to the next position
            currentPosition *= 10;
        }

        return maxValue;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(insertFive(268));  // 5268
        System.out.println(insertFive(670));  // 6750
        System.out.println(insertFive(0));    // 50
        System.out.println(insertFive(-999)); // -5999
    }
}