package Elena.numbers_codingTasks;

public class JCIQ_07_FactorialNumber {
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

    public static int factorial(int number) {
        //Initialize the result to 1 (factorial of 0 is 1)
        int result = 1;

        //Loop from 1 to the given number and multiply
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result; //Return the calculated factorial
    }

    public static void main(String[] args) {
        //Test cases
        System.out.println(factorial(5)); //Output: 120
        System.out.println(factorial(6)); //Output: 720
        System.out.println(factorial(8)); //Output: 40320
    }

}
