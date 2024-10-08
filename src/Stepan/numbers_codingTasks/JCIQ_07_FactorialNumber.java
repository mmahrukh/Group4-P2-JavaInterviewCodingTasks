package Stepan.numbers_codingTasks;

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
 */ // task explanation.

    public static void main(String[] args) {

        System.out.println(factorialCalculation(5));    // output: 120
        System.out.println(factorialCalculation(6));    // output: 720
        System.out.println(factorialCalculation(8));    // output: 40320

    }

    /*
     Test data:
        5 -> 120
        6 -> 720
        8 -> 40320
     */ // test data.

    public static int factorialCalculation(int input){ // recursion counts returns factorial number.

        if(input==1){ // base case.
            return 1;
        }

        return input * factorialCalculation(input - 1); // input * input-1...

    }

}
