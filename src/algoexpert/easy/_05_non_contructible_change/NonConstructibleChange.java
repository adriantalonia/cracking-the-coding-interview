package algoexpert.easy._05_non_contructible_change;

import java.util.Arrays;

public class NonConstructibleChange {

    public static void main(String[] args) {

    }

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        if (coins.length < 1) return 1;
        Arrays.sort(coins);
        var change = 0;
        for (int x = 0; x < coins.length; x++) {
            change += coins[x];
            if(coins.length < x+1 && coins[x+1] > change +1) {
                return change + 1;
            }
        }
        return -1;
    }
}
