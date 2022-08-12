package binarysearch._largest_number_by_two_times;

import java.util.*;


public class Solution {

    public static boolean solve(int[] nums) {
        HashSet<Integer> set = new HashSet<>();


        for (Integer t : nums) {
            set.add(t);
        }
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(set);

        List<Integer> list = new ArrayList<Integer>(myTreeSet);
        if (list.get(list.size()-1) > (list.get(list.size()-2))*2) {
           return true;
        }


        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {0,0};
        System.out.println("result: " + solve(numbers));
    }
}
