package Kostiantyn.numbers_codingTasks;

public class JCIQ_06_FINRA {

        public static void printNumbers() {
            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FINRA");
                } else if (i % 3 == 0) {
                    System.out.println("FIN");
                } else if (i % 5 == 0) {
                    System.out.println("RA");
                } else {
                    System.out.println(i);
                }
            }
        }

        public static void main(String[] args) {
            printNumbers();
        }
    }




    /*
        FINRA - Divisibility by 3 & 5
            alternatives: FIZZBUZZ

        Create a method that will print the numbers from 1 to the given N, but
        if the number is divisible by 3 print "FIN" instead, or
        if the number is divisible by 5 print "RA" instead, or
        if the number is divisible by both 3 & 5 print "FINRA" instead

        parameter: int
        return: void

        Ex:
            input: 30
            output:
                1
                2
                FIN
                4
                RA
                FIN
                7
                8
                FIN
                RA
                11
                FIN
                13
                14
                FINRA
                16
                17
                FIN
                19
                RA
        */

