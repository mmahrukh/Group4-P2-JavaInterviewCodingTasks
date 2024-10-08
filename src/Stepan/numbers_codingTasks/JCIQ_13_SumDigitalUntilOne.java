package Stepan.numbers_codingTasks;

public class JCIQ_13_SumDigitalUntilOne {

     /*
        Sum All Digits Until One Digit

        Create a method to calculate the sum of all the digits until there is only one digit left.
        The sum becomes the next number
            parameter: int
            return: int

        Ex:
        input: 45659
        output:
                2

        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2

        Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2
     */ // task explanation.

    public static void main(String[] args) {

        System.out.println(sumAllDigits(45659)); // output: 2
        System.out.println(sumAllDigits(3244));  // output: 4
        System.out.println(sumAllDigits(24536)); // output: 2

    }

    /*
    Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2
     */ // test data.

    public static int sumAllDigits(int number){ // checks whether here's only 1 digit. CYCLE 1

        int result = calculation(number);       // assigns result from the calculation.

        while(result>=10){                      // cycles the recursion (calculation) until there's only 1 digit.
            result = calculation(result);
        }

        return result;                          // returns result;

    }

    public static int calculation(int number){ // sums all digits into one number. CYCLE 2

        if(number<10){                      // base case if there's no more than 1 digit left.

            return number;

        }else{

            return number%10+calculation(number/10);    // calls another recursion (calculation).

        }

    }

}
