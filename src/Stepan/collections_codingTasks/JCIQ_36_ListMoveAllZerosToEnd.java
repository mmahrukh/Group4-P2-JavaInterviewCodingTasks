package Stepan.collections_codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JCIQ_36_ListMoveAllZerosToEnd {
    /*
        Move All Zeros To The End

        Create a method that will accept an Integer List and return the List with all the zero elements moved to the end
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                moveZeros(5, 0, 0, 1, 4, 0, 14, 1)
            output:
                [5, 1, 4, 14, 1, 0, 0, 0]

     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 0, 0, 1, 4, 0, 14, 1));
        System.out.println(moveZeros(list));    // output: [5, 1, 4, 14, 1, 0, 0, 0]

    }

    public static List<Integer> moveZeros(List<Integer> list){

        // list.removeIf( p -> p == 0 ); // faster way.

        Iterator<Integer> it = list.iterator(); // helps to remove elements from the List during Iteration.
        int zerosCount = 0;             // count zeros.

        while(it.hasNext()){            // iterates through the List.

            int element = it.next();    // assigns value as current element.

            if(element == 0){           // deletes all zeros.

                it.remove();            // deletes.
                zerosCount++;           // counts how many zeros has been removed.

            }

        }

        while(zerosCount!=0){           // adds every deleted zero, but to the end.

            list.add(0);
            zerosCount--;

        }

        return list;                    // returns the princess back.

    }

}
