package Stepan.collections_codingTasks;

import java.util.LinkedHashMap;

public class JCIQ_33_FrequencyOfCharacter {
    /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
     */

    public static void main(String[] args){

        frequencyOfCharacter("banana apple pie");   // output: {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}

    }

    public static void frequencyOfCharacter(String string){

        LinkedHashMap<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {

            char letter = string.charAt(i);

            count.put(letter, count.getOrDefault(letter, 0)+1);

        }

        System.out.println(count);

    }

}
