package Mahrukh.numbers_codingTasks;

public class JCIQ_08_Fibonacci {
    /*
        Fibonacci

        Create a method that will give you the Nth Fibonacci number where N is the given int parameter.
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        parameter: int
        return: int

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
    */
    public static void main(String[] args) {
        System.out.println(fibonacci(0)); // Expected output: 0
        System.out.println(fibonacci(1)); // Expected output: 1
        System.out.println(fibonacci(2)); // Expected output: 1
        System.out.println(fibonacci(3)); // Expected output: 2
        System.out.println(fibonacci(6)); // Expected output: 8
        System.out.println(fibonacci(8)); // Expected output: 21
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int num1 = 0;
        int num2 = 1;
        int next = 0;

        // print until Nth fibonacci sequence
        for (int i = 2; i <= n ; i++) {
            next = num1 + num2;     // Calculate the next Fibonacci number
            num1 = num2;            // Update num1 to the previous num2
            num2 = next;            // Update num2 to the next Fibonacci number
        }
        return num2;
    }
}
