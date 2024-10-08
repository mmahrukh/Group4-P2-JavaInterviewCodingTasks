package Stepan.numbers_codingTasks;

public class JCIQ_12_ReverseString {

    /*
        Reverse Integer

        Create a method to reverse the given number
            parameter: int
            return: int

        Reverse using only numbers, no Strings

        Assume the given number is a positive integer

        Ex:
            input: 1234
            output: 4321
     */ // task explanation.

    public static void main(String[] args) {

        System.out.println(reverseInt(0));      // output: 0
        System.out.println(reverseInt(1));      // output: 1
        System.out.println(reverseInt(1234));   // output: 4321

    }

    public static int reverseInt(int number){ // reverse int.

        return Integer.parseInt(new StringBuilder().append(number).reverse().toString());

        /*
        String numberStr = ""+number;
        StringBuilder sb = new StringBuilder();

        for (int i = numberStr.length()-1; i >= 0; i--) {

            sb.append(numberStr.charAt(i));

        }

        return Integer.parseInt(sb.toString());
        */ // longer way.

    }

}
