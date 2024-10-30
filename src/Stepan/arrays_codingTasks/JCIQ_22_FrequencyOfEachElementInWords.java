package Stepan.arrays_codingTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class JCIQ_22_FrequencyOfEachElementInWords {
     /*
        Frequency of Each Element in Words

        Given an array find the frequency of each element.
        The frequency is the number of times each element appears in the array.
        Output the frequency in a sentence using words to represent the number

        Constraints: a frequency can be any number from 1 to 10.
        If any frequency goes above 10 output: "more than 10" as the message

        Ex:
            input:
                frequencyElement(1,2,3,4,3,2,1,3,2,2,2,4)
            output:
                1 is two
                2 is five
                3 is three
                4 is two
     */

    public static void main(String[] args) {

        int[] array = {1,2,3,4,3,2,1,3,2,2,2,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        frequencyInWords(array);    // output: 1 is two, 2 is five, 3 is three, 4 is two, 5 is more than 10.

    }

    public static void frequencyInWords(int[] array){

        Map<Integer, Integer> words = new LinkedHashMap<>();            // stores words and their frequencies.

        for (int each : array) {

            words.put(each, words.getOrDefault(each, 0)+1); // adds key-values.

        }

        for(Map.Entry<Integer, Integer> each : words.entrySet()){       // gets each key-value.

            int value = each.getValue();    // gets value.
            int key = each.getKey();        // gets key.

            switch (value){                                 // print cases.

                case 1:
                    System.out.println(key+" is one");
                    break;
                case 2:
                    System.out.println(key+" is two");
                    break;
                case 3:
                    System.out.println(key+" is three");
                    break;
                case 4:
                    System.out.println(key+" is four");
                    break;
                case 5:
                    System.out.println(key+" is five");
                    break;
                case 6:
                    System.out.println(key+" is six");
                    break;
                case 7:
                    System.out.println(key+" is seven");
                    break;
                case 8:
                    System.out.println(key+" is eight");
                    break;
                case 9:
                    System.out.println(key+" is nine");
                    break;
                case 10:
                    System.out.println(key+" is ten");
                    break;
                default:
                    System.out.println(key+" is more than 10");
                    break;
            }             // different print cases.

        }

    }

}
