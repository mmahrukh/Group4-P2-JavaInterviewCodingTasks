package Mahrukh.numbers_codingTasks;

public class JCIQ_05_DivisibleBy_3_5_15 {
     /*
        Divisible By 3, 5 & 15

        Create a program that will print all the numbers divisible by 3, 5, and 15
        in the range from 1 to the given N number. Print the grouped sections separately

         Ex:
            input: 100
            output:
                 Divisible By 15: 15 30 45 60 75 90
                 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
     public static void main(String[] args) {
         divisibleBy_3_5_15(100);
     }

    public static void divisibleBy_3_5_15(int n){

        System.out.println("Divisible by 15: ");
        for (int i = 1; i <= n ; i++) {
            if (i % 15 == 0){
                System.out.print(i + "  ");
            }
        }

        System.out.println("\n\nDivisible by 5: ");
        for (int i = 1; i <= n ; i++) {
            if (i % 5 == 0 && i % 15 != 0){
                System.out.print(i + "  ");
            }
        }

        System.out.println("\n\nDivisible by 3: ");
        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0 && i % 15 != 0){
                System.out.print(i + "  ");
            }
        }

    }

}
