package Stepan.numbers_codingTasks;

import java.util.HashMap;
import java.util.Map;

public class JCIQ_16_LovelyNumber {

    /*
        Lovely Number

        Create a method that will count the lovely numbers with the given range.
        The parameters a and b are defined as the lower and upper bounds.
        A number is lovely if it contains fewer than three instances of any distinct digit

        Example of lovely numbers: 0, 100, 1232 and 9922
        Example of non-lovely numbers: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        parameter: int, int
            A and B will be within the range: 0 - 100,000
        return: int

        Ex:
            Given A = 0, B = 0, your function should return 1, because o is
        lovely.

            Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.

            Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
     */ // task explanation.

    public static void main(String[] args) {

        System.out.println(lovelyNumberCount(0, 100_000)); // output result: 92377.

    }

    public static int lovelyNumberCount(int startPoint, int endPoint){

        int lovelyCount = 0;    // counts lovely numbers.

        for (int i = startPoint; i < endPoint ; i++) {  // iterates from startPoint to endPoint.

            Map<Character, Integer> numbers = new HashMap<>();  // contains digits and their counts.
            String number = ""+i;                               // number's String representation.

            for (int j = 0; j < number.length(); j++) { // iterates through number's digits.

                char digit = number.charAt(j);          // assigns char as char.

                numbers.put(digit, numbers.getOrDefault(digit, 0)+1);   // updates digit's count.

            }

            if(!numbers.containsValue(3)){
                lovelyCount++;  // updates lovely count.
            }

        }

        return lovelyCount; // return lovely count.

    }

}
