package Stepan.collections_codingTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class JCIQ_35_InterateSet {
    /*
        Iterate a Set

        Create a program to iterate through a Set and print the values.
        The main focus here is to check your understanding of collection types and how Set is different from others

        Ex:
            input:
                 set: ["java", "selenium", "sql", "api"]
            output:
                java
                selenium
                sql
                api
     */

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>(Arrays.asList("java", "selenium", "sql", "api"));
        eachElement(set);

    }

    public static void eachElement(Set<String> set){    // The hardest task, according to the task's instruction.
                                                        // Hahaha, LMAO!
        for (String each : set) {                       // ????

            System.out.println(each);                   // ????

        }

    }

}
