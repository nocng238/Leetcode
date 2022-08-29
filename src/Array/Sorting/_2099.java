package Array.Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class _2099 {
    public static void main(String[] args) {
        int[] nums = {-8, 13, -13, 2, 10, 28, -10, 21, -23, 17, -33, -9, -22, 3, -34, 3, 39, -13, -5, -19, -1, 37, -15, 12, -12, -8, -9, -9, -14, 32, 21, 37, -22, 27, -23, 29, 15, 37, -14, -20, -16, -24, 12, -10, -34, -27, -34, -14, -39, 2, 14, 27, 34, 2, 1, 8, -22, 16, 2, 36, 17, -5, 20, 15, 19, -4, 19, -25, -17, 24, 9, -25, 6, 33, -23, -14, -29, 38, -36, -3, 23, -25, -34, 12, -37, -40, -32
        };
        maxSubsequence(nums,21);
    }
    static public int[] maxSubsequence(int[] nums, int k) {
        int res[] = new int[k];
        List<Integer> ls = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
            ls.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (queue.peek() < nums[i]){
                int removedNum = queue.poll();
                queue.add(nums[i]);

                modifiedList(ls,nums[i],removedNum);
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = ls.get(i);
        }
        return res;
    }
    static void modifiedList(List<Integer> ls, int numBeAdded, int numBeRemoved){
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) == numBeRemoved){
                ls.remove(i);
                break;
            }
        }
        ls.add(numBeAdded);

    }
}
