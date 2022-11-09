package algoexpert.easy._05_non_contructible_change;

import java.util.Arrays;

public class NonConstructibleChange {

    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        System.out.println("should be 20: " + nonConstructibleChange(coins));

        coins = new int[]{1, 1, 1, 1, 1};
        System.out.println("should be 6: " + nonConstructibleChange(coins));

    }

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        if (coins.length == 1) return coins[0] > 1 ? 1 : 2;
        Arrays.sort(coins);
        var change = 0;
        for (int x = 0; x < coins.length; x++) {
            change += coins[x];
            if (x + 1 < coins.length && coins[x + 1] > change + 1) {
                return change + 1;
            }
        }
        return change + 1;
    }
}
