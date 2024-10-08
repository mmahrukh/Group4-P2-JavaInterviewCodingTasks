package Stepan.numbers_codingTasks;

public class JCIQ_03_ConsecutiveNumbers {

/*
        Consecutive Numbers

        Create a method to print consecutive numbers from 1 to N,
        each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the
        word Codi1ity, Test or Coders respectively. If a number is divisible by more than one of the numbers
        it should be replaced by a concatenation of the respective words.
        The given N value will be a positive integer.

            parameter: int
            return: void

        Example of a number being divisible by 2 & 3:
            when the number is 6 the output should be Codi1ityTest because 6 is divisible by 2 and 3

        Example of a number being divisible by 2 & 5:
            when the number is 10 the output should be Codi1ityCoders because 10 is divisible by 2 and 5

        Ex:
            input: 16
            output:
                1
                Codi1ity
                Test
                Codi1ity
                Coders
                Codi1ityTest
                7
                Codi1ity
                Test
                Codi1ityCoders
                11
                Codi1ityTest
                13
                Codi1ity
                TestCoders
                Codi1ity
*/

    public static void main(String[] args) {

        codilityTestCoders(30);

        // output:
        /*
        1
        Codi1ity
        Test
        Codi1ity
        Coders
        Codi1ityTest
        7
        Codi1ity
        Test
        Codi1ityCoders
        11
        Codi1ityTest
        13
        Codi1ity
        TestCoders
        Codi1ity
        17
        Codi1ityTest
        19
        Codi1ityCoders
        Test
        Codi1ity
        23
        Codi1ityTest
        Coders
        Codi1ity
        Test
        Codi1ity
        29
        Codi1ityTestCoders
         */

    }

/*
                output:
                1
                Codility
                Test
                Codility
                Coders
                CodilityTest
                7
                Codility
                Test
                CodilityCoders
                11
                CodilityTest
                13
                Codility
                TestCoders
                Codility
*/

    public static void codilityTestCoders(int input){ // prints out text ("Codi1ityTestCoders")"input" times

        // if divisible by 2 prints out "Codi1ity".
        // if divisible by 2 prints out "Test".
        // if divisible by 2 prints out "Codi1ity".

        for (int i = 1; i <= input; i++) {

            if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0){     // if divisible by 2,3 and 5 = prints out all 3 words together.

                System.out.println("Codi1ityTestCoders");

            }else if(i % 2 == 0){

                if(i % 3 == 0){                             // if divisible by 2 and 3 = prints out first 2 words.
                    System.out.println("Codi1ityTest");
                }else if(i % 5 == 0){                       // if divisible by 2 and 5 = prints out first and last word.
                    System.out.println("Codi1ityCoders");
                }else{
                    System.out.println("Codi1ity");         // else prints out only first word.
                }

            }else if(i % 3 == 0){

                if(i % 5 == 0){                             // if divisible by 3 and 5 = prints out second and third words.

                    System.out.println("TestCoders");

                }else{                                      // else prints out only second word.

                    System.out.println("Test");

                }

            }else if(i % 5 == 0){                           // prints out only third word.

                System.out.println("Coders");

            }else{                                          // else prints out only a consecutive number.

                System.out.println(i);

            }

        }

    }

}
