package Elena.numbers_codingTasks;

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

    public static int fibonacci(int n) {
        // Handle the base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Variables to store the two previous Fibonacci numbers
        int a = 0; // 0th Fibonacci
        int b = 1; // 1st Fibonacci
        int result = 0;

        // Calculate Fibonacci iteratively
        for (int i = 2; i <= n; i++) {
            result = a + b; // Current Fibonacci number
            a = b; // Update the previous Fibonacci number
            b = result; // Update the current Fibonacci number
        }

        return result; // Return the Nth Fibonacci number
    }


    public static void main(String[] args) {
        // Test cases
        System.out.println(fibonacci(0)); // Output: 0
        System.out.println(fibonacci(1)); // Output: 1
        System.out.println(fibonacci(2)); // Output: 1
        System.out.println(fibonacci(3)); // Output: 2
        System.out.println(fibonacci(6)); // Output: 8
        System.out.println(fibonacci(8)); // Output: 21
    }

   /*
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13.....
        int first = 0;
        int second = 1;
        int next = first + second;
        System.out.print(first + " ");
        System.out.print(second + " ");
        System.out.print(next + " ");

        //print until 5th fibonacci sequence number
        for (int i = 1; i <= 5; i++) {
            first = second; //1, 1, 2
            second = next; //1, 2, 3
            next = first + second; //2, 3, 5
            System.out.print(next + " ");
        }
    }
    */

}