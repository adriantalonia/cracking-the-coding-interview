package binarysearch.strictly_increasing_or_strictly_decreasing;

public class StrictlyIncreasingOrStrictlyDecreasing {

    public static boolean solve(int[] nums) {

        boolean result = true;

        if (nums.length > 2) {
            int init = nums[0];
            char dir = nums[0] > nums[1] ? 'd' : 'a'; // 1 > || 2 <

            for (int i = 1; i < nums.length; i++) {
                if ((dir == 'a' && init > nums[i]) || init == nums[i]) {
                    result = false;
                    break;
                }
                if (dir == 'd' && init < nums[i] || init == nums[i]) {
                    result = false;
                    break;
                }
                init = nums[i];
            }
        } else {
            result = false;
        }
        return result;
    }

    public static boolean solve2(int[] nums) {
        boolean asscending = true;
        boolean descending = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1])
                asscending = false;
            if (nums[i] >= nums[i + 1])
                descending = false;
        }

        return asscending || descending;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        //int[] nums = {2, -5, 3, 2};
        System.out.println(solve2(nums));
    }
}
