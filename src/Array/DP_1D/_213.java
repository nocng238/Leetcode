package Array.DP_1D;

public class _213 {
    public static void main(String[] args) {
        int nums[] = {200,3,140,20,10};
        rob(nums);
        System.out.println(nums[2]);
    }
    static public int rob(int[] nums) {

        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);
        if (nums.length == 3) return Math.max(nums[0],Math.max(nums[1],nums[2]));
        return
                Math.max(robDP(nums,0,nums.length-1),robDP(nums,1, nums.length));



    }
    static int robDP(int[] nums, int first,int last){
        int pre2 = nums[first];
        int pre1 = Math.max(nums[first],nums[first+1]);
        for (int i = first+2; i < last; i++) {
            int temp = pre1;
            pre1 = Math.max(nums[i]+pre2,pre1);
            pre2 = temp;
        }
        return pre1;
    }
}
