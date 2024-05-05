package Contest;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class weekly358 {
    public static void main(String[] args) {

    }
    static public int maxSum(int[] nums) {
        var res = -1;
        var map = new HashMap<Integer, PriorityQueue<Integer>>(
);

        for (int i = 0; i < nums.length; i++) {
            int maximumDigit = getMaximumDigit(nums[i]);
            if(!map.containsKey(maximumDigit)){
                var queue = new PriorityQueue<Integer>(Collections.reverseOrder());
                queue.add(nums[i]);
                map.put(maximumDigit,queue);
            }else {
                map.get(maximumDigit).add(nums[i]);
            }
        }
        for (PriorityQueue<Integer> queue:
             map.values()) {
            if (queue.size() == 1) continue;
            int first = queue.poll();
            int second = queue.poll();
            res = Math.max(res,first+second);
        }
        return res;
    }
    static public int getMaximumDigit(int num) {
        var res = 0;
        while (num != 0){
            res = Math.max(res,num%10);
            num = num/10;
        }

        return res;
    }
}