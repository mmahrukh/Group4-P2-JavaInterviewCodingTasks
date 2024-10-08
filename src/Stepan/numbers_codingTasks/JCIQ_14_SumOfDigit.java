package Stepan.numbers_codingTasks;

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
     */ // task explanation.

    public static void main(String[] args) {

        System.out.println(sumOfDigits(11111)); // output: 5
        System.out.println(sumOfDigits(54321)); // output: 15
        System.out.println(sumOfDigits(214));   // output: 7

    }

    /*
    Test data:
            11111 -> 1 + 1 + 1 + 1 + 1 = 5
            54321 -> 5 + 4 + 3 + 2 + 1 = 15
            214 -> 2 + 1 + 4 = 7
     */ // test data.

    public static int sumOfDigits(int number){ // calculates and returns sum of digits.

        if(number<10){          // base case if number less than 10.

            return number;

        }else{                  // else the recursion proceeds.

            return number % 10 + sumOfDigits(number / 10); // calls the recursion...
                                                                  // ... deducing the most right number's digit.
        }

    }

}
