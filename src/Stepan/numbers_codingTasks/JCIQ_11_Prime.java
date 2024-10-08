package Stepan.numbers_codingTasks;

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
     */ // task explanation.

    public static void main(String[] args) {

        System.out.println(primeNumber(7)); // true;
        System.out.println(primeNumber(6)); // false;
        System.out.println(primeNumber(5)); // true;
        System.out.println(primeNumber(0)); // false;
        System.out.println(primeNumber(1)); // true;
        System.out.println(primeNumber(123)); // false;

    }

    public static boolean primeNumber(int number){


        return primeNumber(number, number); // provides extra variable into the parameter;

    }

    public static boolean primeNumber(int number, int divisor){ // calculates prime number.

        if(divisor==1){                                  // base case if true;

            return true;

        }else if(divisor!=number&&number%divisor==0){    // base case if false;

            return false;

        }else{                                           // else calls another recursion.

            return primeNumber(number, divisor-1);// provides updates divisor into next recursion.

        }

    }

}
