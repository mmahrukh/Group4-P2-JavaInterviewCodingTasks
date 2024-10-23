package Stepan.collections_codingTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class JCIQ_40_SortByValue {
    /*
        Sort by Value

        Create a method that sort the given Map by the value
            parameter: Map<String, Integer>
            return: Map<String, Integer>

            assume the values are Integer that should be sorted smallest to largest

        Ex:
            input:
                sortByValue( {b=1, a=4, n=2, z=0, p=3, l=1, e=2, i=1} )
            output:
                [z=0, b=1, i=1, l=1, e=2, n=2, p=3, a=4]
     */

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "b", 1,
                "a", 4,
                "n",2,
                "z", 0,
                "p", 3,
                "l", 1,
                "e", 2,
                "i", 1
        );

        System.out.println(sortByValue(map));   // output: {z=0, b=1, i=1, l=1, e=2, n=2, p=3, a=4}

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){   // bubble sorting for Map.

        Map<String, Integer> sortedMap = new LinkedHashMap<>();     // stores new sequence of the Map.
        Integer[] numbers = map.values().toArray(new Integer[0]);   // stores values from the Map.
        String[] words = map.keySet().toArray(new String[0]);       // stores keys from the Map.

        for (int i = 0; i < numbers.length-1; i++) {

            for (int j = 0; j < words.length-1-i; j++) {

                int thisNumber = numbers[j], nextNumber = numbers[j+1];                 // for better readability.
                char thisWord = words[j].charAt(0), nextWord = words[j+1].charAt(0);    // for better readability.

                if(thisNumber == nextNumber && thisWord > nextWord || thisNumber > nextNumber){ // analysis.

                    String tempWord = words[j];     // temp String value.
                    Integer tempNumb = numbers[j];  // temp Integer value.

                    numbers[j]=numbers[j+1];        // swaps this Integer value with the next value;
                    numbers[j+1]=tempNumb;          // swaps this Integer value with the next value;

                    words[j]=words[j+1];            // swaps this String value with the next value;
                    words[j+1]=tempWord;            // swaps this String value with the next value;

                }

            }

        }

        for (int i = 0; i < numbers.length; i++) {

            sortedMap.put(words[i], numbers[i]);    // adds new key-value pairs.

        }

        return sortedMap;   // return value.

    }

}
