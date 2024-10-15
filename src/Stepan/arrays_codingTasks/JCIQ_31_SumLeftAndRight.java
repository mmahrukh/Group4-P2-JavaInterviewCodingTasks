package Stepan.arrays_codingTasks;

public class JCIQ_31_SumLeftAndRight {
    /*
        Sum Left and Right

        Create a method that will return an element from that array.
        The element it should return is the middle point where the sum of elements on its left and equal to
        the sum of elements on its right.

        Assume there is always a single valid element in the array values

        Ex:
            Input:
                [4, 9, 1, 3, 6, 4]
            Output:
                1

                -> 1 is the element returned because the left sum = 4 + 9
                is equal to the right sum = 3 + 6 + 4

        Ex:
            Input:
                [1, 2, 3, 4, 100, 10]
            Output:
                100

                -> 100 is the element returned because the left sum = 1 + 2 + 3 + 4
                is equal to the right sum = 10

     */

    public static void main(String[] args) {

        int[] array1 = {4, 9, 1, 3, 6, 4};
        int[] array2 = {1, 2, 3, 4, 100, 10};
        int[] test1 = {-1,-1,-1,-1,-1,-1};

        System.out.println(singleElement(array1));  // output: 1
        System.out.println(singleElement(array2));  // output: 100
        System.out.println(singleElement(test1));   // output: No such element, 404

    }

    public static int singleElement(int[] array){

        for (int i = 1; i < array.length-1; i++) {          // takes one element and assume it as the middle element.

            int sumLeft = 0, sumRight = 0;                  // stores left and right sums.

            for (int j = 0; j < array.length; j++) {        // takes and sums elements.

                if(j==i){                                   // avoids summing the middle element.
                    continue;
                }else if(j<i){                              // sums all elements to the left from the middle element.
                    sumLeft+=array[j];
                }else{                                      // sums all elements to the right from the middle element.
                    sumRight+=array[j];
                }

                if(j==array.length-1 && sumLeft==sumRight){ // if all elements are summed and the sums equal = array[i] middle.
                    return array[i];
                }

            }

        }

        System.err.println("!!! ERROR !!!\nNo such element");  // in case if there is no such perfect element.

        try {                                   // try-catch to maintain the output order of the massage.
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return 404;                             // returns 404 as the result. Like "Error 404".

    }

}
