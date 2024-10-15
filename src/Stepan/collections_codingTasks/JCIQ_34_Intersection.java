package Stepan.collections_codingTasks;

import java.util.*;

public class JCIQ_34_Intersection {
    /*
        Intersection

        Create a method that will return the intersection of the given Set objects.
        The intersection is the shared elements between the Set objects
            parameter: Set<Integer> set1, Set<Integer> set2
            return: Set<Integer>

        Ex:
            input:
                 set1: [3, 4, 1, 7, 2, 6, 5]
                 set2: [6, 2, 5, 1, 8]
            output:
                 [1, 2, 5, 6]
     */

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 4, 1, 7, 2, 6, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 2, 5, 1, 8));

        System.out.println(sharedElements(set1, set2)); // [1, 2, 5, 6]

    }

    public static Set<Integer> sharedElements(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> sharedElements = new TreeSet<>();  // stores shared elements between set1 and set2.

        for (Integer each : set1) {

            if(set2.contains(each)){        // verifies current element from set1 contained set2.

                sharedElements.add(each);   // adds the shared element into the sharedElements set.

            }

        }

        return sharedElements;  // returns the set with the shared elements.

    }

}
