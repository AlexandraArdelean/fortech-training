package course02;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondMax {


    /**
     * Method to find second max value from an array of integers.
     */


    public static void main(String[] args) {
        /**
         * We are setting an array of integers with duplicates numbers;
         */
        int[] integersArray = {1, 2, 45, 46, 112, 110, 1, 112};
        /**
         * After declaring the array, we add the numbers into a sorted set
         * so that the higher number will be at the end;
         * By adding to a sorted set, we eliminate all the duplicates.
         * After sorting, we remove the last number witch represent the highest number in our array
         * and by doing this we get the second max value.
         * After we print the result in the console.
         */
        SortedSet<Integer> integerSortedSet = new TreeSet<>();

        Arrays.stream(integersArray)
                .forEach(integerSortedSet::add);
        if (integerSortedSet.size() >= 2) {
            integerSortedSet.remove(integerSortedSet.last());
            System.out.println("Second max value is: " + integerSortedSet.last());
        } else {
            System.out.println("No second max value was found!");
        }

    }
}
