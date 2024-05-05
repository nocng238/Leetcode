package TwoPointers;

import java.util.Arrays;

public class _75 {
    public static void main(String[] args) {
        int[] a = { 2, 0, 2, 1, 1, 0 };
        for (int i : sortColors(a)) {
            System.out.println(i);
        }
    }

    // my O(n) time O(n) space
    public static int[] sortColors(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        int indexOf2 = nums.length - 1;
        int indexOf0 = 0;
        for (int num : nums) {
            if (num == 0) {
                res[indexOf0] = 0;
                indexOf0++;
            }
            if (num == 2) {
                res[indexOf2] = 2;
                indexOf2--;
            }
        }
        return res;
    }

    /// O(n) O(1) match the problem
    public void sortColors2(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }

            else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

    }

}
