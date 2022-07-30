package binarysearch.minimum_Initial_value_for_positive_prefix_sums;

public class MinimumInitialValueforPositivePrefixSums {

    public static int solve(int[] nums) {
        // Store the minimum prefix sum
        int minValue = 0;

        // Stores prefix sum at each index
        int sum = 0;

        // Traverse over the array
        for(int n : nums)
        {

            // Update the prefix sum
            sum += n;

            // Update the minValue
            minValue = Math.min(minValue, sum);
        }

        int startValue = 1 - minValue;

        // Return the positive start value
        return startValue;
    }

    public static void main(String[] args) {
        int[] nums = {-3, -3};
        //int[] nums = {2, -5, 3, 2};
        System.out.println(solve(nums));
    }
}
