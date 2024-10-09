package Elena.numbers_codingTasks;

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

    public static void divide(int num1, int num2) {
        //Handle division by zero
        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
            return;
        }

        //Calculate the division value
        int quotient = 0;
        int remainder = num1;

        //Subtract num2 from num1 until remainder is less than num2
        while (remainder >= num2) {
            remainder -= num2; //Reduce remainder
            quotient++;        //Increase quotient
        }

        //Display the result
        System.out.printf(num1 + " / " + num2 + " is " + quotient + " with remainder " + remainder + "\n");
    }

    public static void main(String[] args) {
        //Test cases
        divide(6, 2); // 6 / 2 is 3 with remainder 0
        divide(7, 2); // 7 / 2 is 3 with remainder 1
        divide(8, 3); // 8 / 3 is 2 with remainder 2
        divide(7, 0); // Cannot divide by 0
        divide(3, 5); // 3 / 5 is 0 with remainder 3
    }

}
