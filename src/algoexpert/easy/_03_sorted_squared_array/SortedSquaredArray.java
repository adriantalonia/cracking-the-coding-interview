package algoexpert.easy._03_sorted_squared_array;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.

        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println("result: " + sortedSquaredArray(array));
    }
}
