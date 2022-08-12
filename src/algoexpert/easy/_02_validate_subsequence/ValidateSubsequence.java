package algoexpert.easy._02_validate_subsequence;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int index = 0;
        for(int i = 0; i < array.size(); i++){
            if(array.get(i)==sequence.get(index)) {
                index++;
            }
            if(index == sequence.size()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println("result: "+isValidSubsequence(array,sequence));
    }
}
