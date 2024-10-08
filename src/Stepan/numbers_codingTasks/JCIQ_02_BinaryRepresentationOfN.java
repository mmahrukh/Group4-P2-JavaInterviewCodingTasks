package Stepan.numbers_codingTasks;

public class JCIQ_02_BinaryRepresentationOfN {

/*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
 */ // task explanation

    public static void main(String[] args) {

        System.out.println(calculateBits(6));   // output: 2
        System.out.println(calculateBits(7));   // output: 3
        System.out.println(calculateBits(4));   // output: 1
        System.out.println(calculateBits(10));  // output: 2
        System.out.println(calculateBits(15));  // output: 4
        System.out.println(calculateBits(16));  // output: 1

    }

/*
Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
 */

    public static int calculateBits(int input){

        int number = Integer.parseInt(Integer.toBinaryString(input)); // gets binary from the input as integer.
        int result = 0; // stores future result.

        while(number!=0){

            result+=number%10;  // concatenates last the most right numeral from the number.
            number /= 10;       // reduces the most right number from the number.

        } // while number not equals to zero loop lasts.

        return result; // returns the result.

    }

}
