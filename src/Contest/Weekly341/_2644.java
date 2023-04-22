package Contest.Weekly341;

public class _2644 {
    public int maxDivScore(int[] nums, int[] divisors) {
        int res = Integer.MAX_VALUE;
        int maxDivScore = 0;
        int count[] = new int[divisors.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < divisors.length; j++) {
                if (nums[i] % divisors[j] == 0) {
                    count[j]++;
                }
            }
        }
        for (int i = 0; i < divisors.length; i++) {
            if (count[i] > maxDivScore) {
                maxDivScore = count[i];
                res = divisors[i];
            }
            if (count[i] == maxDivScore) {
                res = Math.min(res, divisors[i]);
            }
        }
        return res;
    }
}
