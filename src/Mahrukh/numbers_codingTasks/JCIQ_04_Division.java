package Mahrukh.numbers_codingTasks;

public class JCIQ_04_Division {
    /*
    Divide Without Division

    Create a method to divide two numbers without using the division operator.
    Display the division value as well as any remainder
        parameter: int, int
        return: void

    output format: num1 / num2 is resultValue with remainder $remainderValue

    edge cases:
        cannot divide by 0

    Ex:
        input: 6, 2
        output: 6 / 2 is 3 with remainder 0
    Test data:
        6, 2 -> 6 / 2 is 3 with remainder 0
        7, 2 -> 7 / 2 is 3 with remainder 1
        8, 3 -> 8 / 3 is 2 with remainder 2
        7, 0 -> Cannot divide by 0
        3, 5 -> 3 / 5 is 0 with remainder 3

 */
    public static void main(String[] args) {
        divideNumbers(6, 2);
        divideNumbers(7, 2);
        divideNumbers(8, 3);
        divideNumbers(7, 0);
        divideNumbers(3, 5);
    }

    /*
        Dividend: The number that is being divided.
        Divisor: The number that you are dividing by.
        Quotient: The result of the division (the answer).
        Remainder: The leftover amount after dividing completely
     */
    public static void divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Cannot divide by 0");
            return;
        }

        int quotient = 0;
        int remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println(dividend + " / " + divisor + " is "  + quotient + " with remainder " + remainder );
    }
}
