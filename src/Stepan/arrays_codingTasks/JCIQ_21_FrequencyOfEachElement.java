package Stepan.arrays_codingTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class JCIQ_21_FrequencyOfEachElement {
    /*
        Frequency Of Each Element

        Given an array find the frequency of each element.
        The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {

        String[] array = {"Apple","Banana","Apple","Cherry"};
        wordsFrequency(array);  // output: Apple = 2, Banana = 1, Cherry = 1

    }

    public static void wordsFrequency(String[] array){

        Map<String, Integer> words = new LinkedHashMap<>();            // stores words and their frequencies.

        for (String each : array) {

            words.put(each, words.getOrDefault(each, 0)+1); // adds key-values.

        }

        for(Map.Entry<String, Integer> each : words.entrySet()){       // gets each key-value.

            System.out.println(each.getKey()+" = "+each.getValue());   // prints each key-value.

        }

    }

}
