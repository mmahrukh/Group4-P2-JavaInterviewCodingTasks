package Elena.numbers_codingTasks;

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

    public static int countOnesInBinary(int n) {
        // Convert the number to a binary string
        String binaryString = Integer.toBinaryString(n);

        int count = 0;

        // Loop through the binary string and count the '1' characters
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countOnesInBinary(6));  // 2
        System.out.println(countOnesInBinary(7));  // 3
        System.out.println(countOnesInBinary(4));  // 1
        System.out.println(countOnesInBinary(10)); // 2
        System.out.println(countOnesInBinary(15)); // 4
        System.out.println(countOnesInBinary(16)); // 1
    }
}