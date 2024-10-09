package Mahrukh.numbers_codingTasks;

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
     public static void main(String[] args) {
         System.out.println(MaxValue(268)); // Expected output: 5268
         System.out.println(MaxValue(670)); // Expected output: 6750
         System.out.println(MaxValue(0)); // Expected output: 50
         System.out.println(MaxValue(-999)); // Expected output: -5999
         System.out.println(MaxValue(786)); // Expected output: 7865
     }

    public static int MaxValue(int n){

        boolean isPositive = n >= 0; // Check if the number is positive or negative and store the sign in isPositive variable
        n = Math.abs(n);             // Make the number positive as we are only interested in inserting 5 in the number
        String strNum = "" + n;      // Converting the number to a string to be able to manipulate it easily
        boolean added = false;

        for (int i = 0; i < strNum.length(); i++) {

            int digit = Integer.parseInt(strNum.substring(i, i+1)); // Reading one character at a time and storing it in digit after converting it to an int

            if ( (isPositive && digit < 5) || (!isPositive && digit > 5)){ // If the digit is positive and the digit is less than 5 or if the digit is neg and digit is greater than 5
                strNum = strNum.substring(0, i) + 5 + strNum.substring(i); // Replace the current digit with 5 and break the loop as we have found the position
                added = true;                                              // Flag to indicate that we have added 5 to the number
                break;
            }

        }

        // If we have not added 5 to the number, add it at the end
        if (!added){
            strNum = strNum + 5;
        }

        return Integer.parseInt(strNum) * (isPositive ? 1 : -1);  // Converting the string back to an integer and returning it
    }
}
