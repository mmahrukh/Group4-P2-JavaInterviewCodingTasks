package Stepan.numbers_codingTasks;

public class JCIQ_06_FINRA {

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
        */ // task explanation.

    public static void main(String[] args) {

        finRa(30);

        /*
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
                FIN
                22
                23
                FIN
                RA
                26
                FIN
                28
                29
                FINRA
         */ // output result.

    }

    public static void finRa(int endPoint){ // if divisible by 3 prints out "FIN", by 5 - "RA", both - "FINRA".

        for (int i = 1; i <= endPoint ; i++) {

            if(i % 3 == 0 && i % 5 == 0){ // if divisible by 3 and 5 prints out "FINRA".

                System.out.println("FINRA");

            }else if(i % 3 == 0){                // if divisible by 3 prints out "FIN".

                System.out.println("FIN");

            }else if(i % 5 == 0){                // if divisible by 5 prints out "RA".

                System.out.println("RA");

            }else{                                      // else prints out value of i.

                System.out.println(i);

            }

        }

    }

}
