package Stepan.collections_codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JCIQ_39_RemovePalindromeStrings {
    /*
        Remove Palindrome Strings

        Create a method that will accept a List of Strings and return the List with all palindrome Strings removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removePalindrome("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop")
            output:
                [hello, java, house, you]

     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList
                ("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop")
        );

        System.out.println(removePalindrome(list)); // output: [hello, java, house, you]

    }

    public static List<String> removePalindrome(List<String> list){

        // list.removeIf( p -> p.contentEquals(new StringBuilder().append(p).reverse()) ); // the fastest way.

        // the longest way:

        Iterator<String> it = list.iterator();          // helps to iterate.

        while(it.hasNext()){                            // iterates through the list.

            String word = it.next();                    // String representation of the current element.
            StringBuilder sb = new StringBuilder();     // StringBuilder for more efficient way to concatenate each char.

            for (int i = word.length()-1; 0<=i ; i--) { // reversed loop.

                sb.append(word.charAt(i));              // adds each char from the word to get the mirrored version.

            }

            if(word.contentEquals(sb)){                 // if mirrored version equals to the original one => palindrome.

                it.remove();                            // remove the palindrome.

            }

        }

        return list;        // returns the sorted list.

    }

}
