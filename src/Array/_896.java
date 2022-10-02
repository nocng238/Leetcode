package Array;

public class _896 {
    public static void main(String[] args) {

    }

    static public boolean isMonotonic(int[] nums) {
        if (nums.length < 3)
            return true;
        int index = 0;
        while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
            index++;
        }
        if (index == nums.length - 1)
            return true; // in case [1,1,1]
        if (nums[index] > nums[index + 1]) {
            while (index < nums.length - 1) {
                if (nums[index] < nums[index + 1])
                    return false;
                index++;
            }
        } else {
            while (index < nums.length - 1) {
                if (nums[index] > nums[index + 1])
                    return false;
                index++;
            }
        }
        return true;
    }
}
