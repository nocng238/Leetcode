package TopInterview150.ArrayAndString;

public class _189 {
    public static void main(String[] args) {
        
    }
    static public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res[(i+k)%n] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
