package Mahrukh.numbers_codingTasks;

public class JCIQ_11_Prime {
    /*
        Prime

        Create a method to check if the given N is a prime number
            parameter: int
            return: boolean

        A number is prime if it is only divisible by one and itself

        Ex:
            7 -> prime, because only 1 and 7 can be divided evenly
            6 -> not prime, because 6 is divisible by 2 and 3 also
     */
    public static void main(String[] args) {
        System.out.println("isPrime(7) = " + isPrime(7));
        System.out.println("isPrime(6) = " + isPrime(6));
    }

    public static boolean isPrime(int n){

        if (n <= 1){
            return false;                       // number less than or equal to 1 are not prime
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;                   // if n is divisible by any number it is not prime
            }
        }

        return true;
    }
}
