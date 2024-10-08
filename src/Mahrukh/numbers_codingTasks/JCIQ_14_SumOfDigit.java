package Mahrukh.numbers_codingTasks;

public class JCIQ_14_SumOfDigit {
    /*
        Sum Of Digits Of Integer

        Create a method that will calculate the sum of the number's digits. Do not use any String manipulation
            parameter: int
            return: int

        Ex:
            input: 123
            output: 6
            -> 1 + 2 + 3

        Test data:
            11111 -> 1 + 1 + 1 + 1 + 1 = 5
            54321 -> 5 + 4 + 3 + 2 + 1 = 15
            214 -> 2 + 1 + 4 = 7
     */
    public static void main(String[] args) {
        System.out.println("sumOfNumDigits(11111) = " + sumOfNumDigits(11111));
        System.out.println("sumOfNumDigits(54321) = " + sumOfNumDigits(54321));
        System.out.println("sumOfNumDigits(214) = " + sumOfNumDigits(214));
    }

    public static int sumOfNumDigits(int n){
        int sum = 0;

        while(n != 0){
            int digit = n % 10;  // gets the last digit

            if (digit < 0){
                sum -= digit;
            }else {
                sum += digit;
            }

            n /= 10; //removes the last digit after every iteration
        }

        return sum;
    }
}
