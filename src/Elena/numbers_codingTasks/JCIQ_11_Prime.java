package Elena.numbers_codingTasks;

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

    public static boolean isPrime(int n) {
        // Prime numbers must be greater than 1
        if (n <= 1) {
            return false;
        }

        // Check for divisors from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrime(7));  // true
        System.out.println(isPrime(6));  // false
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(20)); // false
    }
}