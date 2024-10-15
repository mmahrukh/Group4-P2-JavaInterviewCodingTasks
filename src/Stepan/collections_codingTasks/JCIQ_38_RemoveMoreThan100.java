package Stepan.collections_codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JCIQ_38_RemoveMoreThan100 {
     /*
        Remove More Than 100

        Create a method that will accept an Integer List and return the List with any value greater than 100 removed
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                removeMoreThan100(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823)
            output:
                [50, 24, 29, -255, 87, 99]

     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823));
        System.out.println(removeMoreThan100(list));    // output: [50, 24, 29, -255, 87, 99]

    }

    public static List<Integer> removeMoreThan100(List<Integer> list){

        list.removeIf( p -> p > 100 ); // faster way.
        return list;

        /*                                      // longer way:

        Iterator<Integer> it = list.iterator(); // helps to iterate.

        while(it.hasNext()){                    // iterates.

            if(it.next() > 100){                // if current element > 100 then remove it.
                it.remove();
            }

        }

        return list;    // returns the sorted list.

         */

    }

}
