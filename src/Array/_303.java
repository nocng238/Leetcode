package Array;

public class _303 {
    class NumArray {
        public int prefix[];

        public NumArray(int[] nums) {
            this.prefix = new int[nums.length];
            this.prefix[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefix[i] += prefix[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return left == 0 ? this.prefix[right] : this.prefix[right] - this.prefix[left] - 1;
        }
    }
}
