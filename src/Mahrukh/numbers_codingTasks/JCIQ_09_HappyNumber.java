package Mahrukh.numbers_codingTasks;

public class JCIQ_09_HappyNumber {
    /*
        Happy Number

        Create a method that will check if the given number is a happy or an unhappy number

        A happy number is when the sum of its digits squared eventually result in 1.
        Hint: Read each digit of the number, square the number and take the number for the next number to be checked

        An unhappy number is when the numbers consistently end up as 4

        Ex:
            32
            Happy
            Breakdown:
                32 -> 3^2 + 2^2 = 9 + 4 = 13
                13 -> 1^2 + 3^3 = 1 + 9 = 10
                10 -> 1^2 + 0^2 = 1 + 0 = 1

        Ex:
            42
            Unhappy
            Breakdown:
                42 -> 4^2 + 2^2 = 16 + 4 = 20
                20 -> 2^2 + 0^2 = 4 + 0 = 4
     */
    public static void main(String[] args) {
        System.out.println(isHappy(32)); // Expected output: Happy
        System.out.println(isHappy(42)); // Expected output: Unhappy
    }

    public static String isHappy(int n){

        while (n != 1 && n != 4){

            int sum = 0;

            while (n > 0){  // to read all the digits
               int eachDigit = n % 10;
               sum += Math.pow(eachDigit, 2);       // sum += eachDigit * eachDigit
               n /= 10;
            }

            n = sum;
        }
        return n == 1? "Happy" : "Unhappy";
    }
}
