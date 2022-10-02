package Array.DP_1D;

import java.util.Arrays;

public class _332 {
    public static void main(String[] args) {
        coinChange(new int[] { 2, 3, 5 }, 11);
    }

    static public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            for (int coin : coins) {
                if (coin > i) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                System.out.println(dp[i]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }
}
