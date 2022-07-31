package leetcode.two_sum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        Arrays.stream(twoSum(nums, target)).forEach(i -> System.out.print(i+" "));
    }

    public static int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = 0;
        int[] result;

        for(int i = 0; i< nums.length; i++) {
            for(int j = i+1; j< nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    x = i;
                    y = j;
                    break;
                }
            }
            if(y>0) break;

        }

        return y > 0 ? new int[]{x,y} : new int[]{};

    }
}
