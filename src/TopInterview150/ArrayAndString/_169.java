package TopInterview150.ArrayAndString;

public class _169 {
    public static void main(String[] args) {

    }
    static public int majorityElement(int[] nums) {
        // O(N) time,O(1) space
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }

            majority += n == res ? 1 : -1;
        }

        return res;
    }
}
