package Mahrukh.numbers_codingTasks;

public class JCIQ_02_BinaryRepresentationOfN {
    /*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */
    public static void main(String[] args) {
        System.out.println(N_Binary(6));   // 2
        System.out.println(N_Binary(7));   // 3
        System.out.println(N_Binary(4));   // 1
        System.out.println(N_Binary(10));  // 2
        System.out.println(N_Binary(15));  // 4
        System.out.println(N_Binary(16));  // 1
    }

    public static int N_Binary(int n){

        //1- Convert to binary

        String binary = "";     //store binary in a string

        while(n > 0){
            binary = (n % 2) + binary;
            n /= 2;         // in order to check the power of two positions
        }

        //2- how many 1's do we have in the calculated binary
        int count = 0;

        for(char each : binary.toCharArray()){
            if(each == '1'){
                count++;
            }
        }

        return count;

        // alternative solution:
        // return binary.replace("0", "").length();
    }
}
