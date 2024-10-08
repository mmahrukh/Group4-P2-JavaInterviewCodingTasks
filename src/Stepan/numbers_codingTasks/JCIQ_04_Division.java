package Stepan.numbers_codingTasks;

public class JCIQ_04_Division {

    /*
    Divide Without Division

    Create a method to divide two numbers without using the division operator.
    Display the division value as well as any remainder
        parameter: int, int
        return: void

    output format: num1 / num2 is resultValue with remainder $remainderValue

    edge cases:
        cannot divide by 0

    Ex:
        input: 6, 2
        output: 6 / 2 is 3 with remainder 0
    Test data:
        6, 2 -> 6 / 2 is 3 with remainder 0
        7, 2 -> 7 / 2 is 3 with remainder 1
        8, 3 -> 8 / 3 is 2 with remainder 2
        7, 0 -> Cannot divide by 0
        3, 5 -> 3 / 5 is 0 with remainder 3

 */ // the task explanation.

    public static void main(String[] args) {

        divideNumber(6,2);  // 6 / 2 is 3 with remainder 0
        divideNumber(7,2);  // 7 / 2 is 3 with remainder 1
        divideNumber(8,3);  // 8 / 3 is 2 with remainder 2
        divideNumber(7,0);  // cannot divide by 0
        divideNumber(3,5);  // 3 / 5 is 0 with remainder 3

    }

    /*
    Test data:
        6, 2 -> 6 / 2 is 3 with remainder 0
        7, 2 -> 7 / 2 is 3 with remainder 1
        8, 3 -> 8 / 3 is 2 with remainder 2
        7, 0 -> Cannot divide by 0
        3, 5 -> 3 / 5 is 0 with remainder 3
     */ // test data.

    public static void divideNumber(int num1, int num2){ // divides num1 on num2 without division operator.

        /*
        System.out.println(num1+" / "+num2+" is "+Math.divideExact(num1, num2)+" with remainder "+num1%num2);
        Using Math's divideExact method
        */ // method using "Math" Java's utility class.

        int number = num1;          // assigns num1's value to the variable.
        int result = 0;             // stores result.
        int remainder = num1;       // counts remainder. Originally assigned as num1 in case of num2>num1.

        while(number>0 && num2!= 0 && num1>num2 && number-num2>=0){

            number-= num2;          // updates num1.
            remainder = number;     // updates remainder.
            result++;               // updates the count of cycles.

        }

        if(num2==0){    // checks if num2 is zero.
            System.out.println("cannot divide by 0");
        }else{          // prints out result.
            System.out.println(num1+" / "+num2+" is "+result+" with remainder "+remainder);
        }


    }

}
