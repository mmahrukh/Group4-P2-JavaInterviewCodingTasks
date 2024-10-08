package Stepan.numbers_codingTasks;

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
     */ // task explanation.

    public static void main(String[] args) {

        divideFromZero(100);
        /*
        Divisible By 3: 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99
        Divisible By 5: 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100
        Divisible By 15: 15 30 45 60 75 90
         */ // output

    }

    public static void divideFromZero(int endNumber){

        StringBuilder by3 = new StringBuilder("Divisible By 3: ");
        StringBuilder by5 = new StringBuilder("Divisible By 5: ");
        StringBuilder by15 = new StringBuilder("Divisible By 15: ");

        for (int i = 1; i <= endNumber ; i++) {

            if(i%3==0){
                by3.append(i).append(" ");
            }
            if(i%5==0){
                by5.append(i).append(" ");
            }
            if(i%15==0){
                by15.append(i).append(" ");
            }

        }

        System.out.println(by3);
        System.out.println(by5);
        System.out.println(by15);

    }

}
