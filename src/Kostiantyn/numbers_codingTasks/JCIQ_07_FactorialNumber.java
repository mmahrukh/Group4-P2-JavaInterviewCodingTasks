package Kostiantyn.numbers_codingTasks;

public class JCIQ_07_FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));  // Expected output: 120
        System.out.println(factorial(6));  // Expected output: 720
        System.out.println(factorial(8));  // Expected output: 40320
    }

    public static int factorial(int number) {
        int result = 1;


        for (int i = 1; i <= number; i++) {  // -->  Multiply all the positive integers from 1 to the given number
            result *= i;
        }

        return result;
    }
    /*
    Factorial Number

    Create a method that will accept an int number and return the factorial of that number.
        parameter: int
        return: int

    A factorial number is the product of all the positive integers that come before that number.
    In math the factional is represented with an exclamation point

    -> 5 factional is: 5!

    Ex:
        input: 5
        output: 120

        -> all the positive numbers from the number, 5, are multiplied
            5! = 5 * 4 * 3 * 2 * 1
    Test data:
        5 -> 120
        6 -> 720
        8 -> 40320
 */
}
