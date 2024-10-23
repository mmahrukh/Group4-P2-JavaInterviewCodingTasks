package Stepan.collections_codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JCIQ_37_RemoveAhmed {
    /*
        Remove Ahmed

        Create a method that will accept a List of names and return the List with all the Ahmed names removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removeAhmed("Ahmed", "John", "Eric", "Ahmed")
            output:
                [John, Eric]

     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removePoorAhmed(list));  // output: [John, Eric]

    }

    public static List<String> removePoorAhmed(List<String> list){

        list.removeIf( p -> p.equals("Ahmed") ); // faster way.
        return list;

        /*                                       // longer way.
        Iterator<String> it = list.iterator();

        while(it.hasNext()){

            if(it.next().equals("Ahmed")){
                it.remove();
            }

        }

        return list;
        */


    }

}
