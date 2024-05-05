package Contest;

public class weekly392 {
    public static void main(String[] args) {

    }

    static public int longestMonotonicSubarray(int[] nums) {
        int res = 0;
        int count = 1;
        boolean increaseFlag = true;
        boolean decreaseFlag = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (increaseFlag) {
                    count++;
                } else {
                    res = Math.max(count, res);
                    count = 2;
                    increaseFlag = true;
                }
                decreaseFlag = false;

            } else if (nums[i] < nums[i - 1]) {
                if (decreaseFlag) {
                    count++;
                } else {
                    res = Math.max(count, res);
                    count = 2;
                    decreaseFlag = true;
                }
                increaseFlag = false;
            } else {
                res = Math.max(count, res);
                count = 1;
                increaseFlag = true;
                decreaseFlag = true;
            }
        }

        return Math.max(count, res);
    }
}
