package Array.DP_1D;

import java.util.Arrays;

public class _300 {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        lengthOfLIS(nums);
    }

    // DP 0(N^2)
    static public int lengthOfLIS(int[] nums) {

        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
        }

        return max;
    }

    // O(nlogn) with binary search(havent get it yet)
    public int lengthOfLIS2(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > ans[len - 1]) {
                ans[len] = nums[i];
                len++;
            } else {
                int idx = binarySearch(ans, len - 1, nums[i]);
                ans[idx] = nums[i];
            }
        }
        return len;
    }

    public int binarySearch(int[] ans, int hi, int item) {
        int lo = 0;
        int mid;
        int idx = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (ans[mid] >= item) {
                idx = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return idx;
    }
}
