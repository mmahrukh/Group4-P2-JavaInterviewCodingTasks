package Kostiantyn.numbers_codingTasks;

public class JCIQ_04_Division {
    public static void main(String[] args) {
        divideWithoutDivision(6, 2); // Expected output: 6 / 2 is 3 with remainder 0
        divideWithoutDivision(7, 2); // Expected output: 7 / 2 is 3 with remainder 1
        divideWithoutDivision(8, 3); // Expected output: 8 / 3 is 2 with remainder 2
        divideWithoutDivision(7, 0); // Expected output: Cannot divide by 0
        divideWithoutDivision(3, 5); // Expected output: 3 / 5 is 0 with remainder 3
    }

    public static void divideWithoutDivision(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
            return;
        }

        int result = 0;
        int remainder = num1;


        while (remainder >= num2) { //--> Subtract the divisor from the dividend until the remainder is less than the divisor
            remainder -= num2;
            result++;
        }


        System.out.println(num1 + " / " + num2 + " is " + result + " with remainder " + remainder);
    }
}
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

