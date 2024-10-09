package Kostiantyn.numbers_codingTasks;

public class JCIQ_15_SwapNumbers {
    public static void swap(int a, int b) { //custom method defined to accept 2 arguments
        // Print original values
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping logic
        a = a + b; // Step 1: a becomes the sum of a and b
        b = a - b; // Step 2: subtract /b becomes the original value of ali
        a = a - b; // Step 3: a becomes the original value of b

        // Print swapped values
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swap (0,-3) ;}   //// Call the method , pass 2 arguments  to swap the values

    /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */
}
