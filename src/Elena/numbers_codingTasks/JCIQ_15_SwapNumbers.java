package Elena.numbers_codingTasks;

public class JCIQ_15_SwapNumbers {
    /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */

    public static void main(String[] args) {
        swapIntegers(15, 40);
    }

    // Method to swap two integers
    public static void swapIntegers(int num1, int num2) {
        System.out.println("Values before swap: ");
        printValues(num1, num2); // print values before swapping

        // Swap logic using addition and subtraction
        num1 = num1 + num2; //1. Add both numbers
        num2 = num1 - num2; //2. Subtract the second number from the sum to get the first number
        num1 = num1 - num2; //3. Subtract the new second number from the sum to get the second number

        System.out.println("Values after swap: ");
        printValues(num1, num2); // print values after swapping

    }

    // Method to print the values of num1 and num2
    public static void printValues(int num1, int num2) {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

}
