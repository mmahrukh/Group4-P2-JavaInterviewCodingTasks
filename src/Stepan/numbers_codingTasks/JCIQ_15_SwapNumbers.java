package Stepan.numbers_codingTasks;

public class JCIQ_15_SwapNumbers {

    /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */ // task explanation.

    public static void main(String[] args) {

        int a = 5; // 5 in bits = 0101
        int b = 3; // 3 in bits = 0011

        // swap bits of them:

        a = a ^ b; // 0110 = 0101 ^ 0011
        b = a ^ b; // 0101 = 0110 ^ 0011
        a = a ^ b; // 0011 = 0110 ^ 0101

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }

}
