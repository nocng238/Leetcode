package Array.DP_1D;

import java.util.*;
//import java.util.Set;

public class _2266 {
    public static void main(String[] args) {

    }
    Set<Character> set = new HashSet<>(Arrays.asList('7', '9'));

    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        int mod = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            char c = pressedKeys.charAt(i - 1);
            int max = set.contains(c) ? 3 : 2;
            for (int j = 1; j <= max; j++) {
                int pre = i - j - 1;
                if (pre >= 0 && pressedKeys.charAt(pre) == c) {
                    dp[i] = (dp[i] + dp[pre]) % mod;
                } else {
                    break;
                }
            }
        }
        return dp[n];
    }
}
