package Mahrukh.numbers_codingTasks;

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
     */

    public static void main(String[] args) {
        System.out.println("lovelyNumbers(0, 0) = " + lovelyNumbers(0, 0));
        System.out.println("lovelyNumbers(1, 111) = " + lovelyNumbers(1, 111));
        System.out.println("lovelyNumbers(100000, 100000) = " + lovelyNumbers(100000, 100000));
    }

    public static int lovelyNumbers(int a, int b){
        int count = 0;

        // Iterate through each number in the range [a..b] and check if it is lovely
        for(int i = a; i <= b; i++){
            int num = i;                    // number
            int digitCount[] = new int[10]; // number of digits

            // Special case for number 0
            if (num == 0){
                digitCount[0] = 1;  // 0 have one '0'
            }

            // Count the occurrence of each digit in the number
            while(num!= 0){
                digitCount[num % 10]++;
                num /= 10;
            }

            boolean isLovely = true;

            // Check if any digit appears 3 or more times
            for(int j = 0; j < 10; j++){
                if(digitCount[j] >= 3){
                    isLovely = false;
                    break;
                }
            }

            // If the number is lovely, increment the count
            if(isLovely){
                count++;
            }
        }

        return count;
    }

}
