package geeksforgeeks._02_reverse_array_in_groups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayInGroups {

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        if(n >= k) {
            List<Integer> start = arr.subList(0, k);
            List<Integer> end = arr.subList(k, n);
            Collections.reverse(start);
            Collections.reverse(end);
            start.addAll(end);
            for (int i = 0; i< n; i ++) {
                arr.set(i,start.get(i));
            }
        } else {
            Collections.reverse(arr);
        }

    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        reverseInGroups(list, list.size(), 3);
    }
}
