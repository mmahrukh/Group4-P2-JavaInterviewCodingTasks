package Stepan.numbers_codingTasks;

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
    */ // task explanation.

    public static void main(String[] args) {

        System.out.println(fibonacci(0));   // 0
        System.out.println(fibonacci(1));   // 1
        System.out.println(fibonacci(2));   // 1
        System.out.println(fibonacci(3));   // 2
        System.out.println(fibonacci(6));   // 8
        System.out.println(fibonacci(8));   // 21

    }

    /*
    Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
     */ // test data.

    public static int fibonacci(int amount){ // recursion counts fibonacci.

        if(amount==0){          // base case 1.
            return 0;
        }else if(amount==1){    // base case 2.
            return 1;
        }

        return fibonacci(amount-1) + fibonacci(amount-2); // calculation.

    }

}
