package Array.DP_1D;

public class _198 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        rob(arr);
    }
    static  public int rob(int[] nums) {
        if (nums.length == 1 ) return nums[0];
        nums[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i]+nums[i-2],nums[i-1]);
        }
        return nums[nums.length-1];
    }
}
