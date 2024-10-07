package Mahrukh.numbers_codingTasks;

public class JCIQ_15_SwapNumbers {
    /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */

    public static void main(String[] args) {
        swapNumbers(10, 11);
    }


    public static void swapNumbers(int a, int b){

        System.out.println("Before the swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After the swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
