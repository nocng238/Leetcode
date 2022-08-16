package Array;

public class _334 {
    public static void main(String[] args) {

    }
    static public boolean increasingTriplet(int[] nums) {
        int l  =0;
        int r  = nums.length-1;
        int previousLeft =Integer.MAX_VALUE;
        int previousRight=Integer.MIN_VALUE;
        while (l < r){
            if (nums[l] < nums[r]){
                if (previousLeft < nums[l]) return true;
                previousLeft= nums[l];
                l++;
            }else {
                if (previousRight> nums[r]) return true;
                previousRight = nums[r];
                r--;
            }

        }




        return false;
    }
}
