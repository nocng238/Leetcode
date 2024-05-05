package HashTable;

import java.util.*;

public class _2404 {
    public static void main(String[] args) {

    }
    static public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums
             ) {
            if (num %2 == 0) map.put(num,map.getOrDefault(num,0)+1);
        }
        int res = -1;
        int max = 0;
        for (Integer num:map.keySet()
             ) {
            if (max > map.get(num)){
            } else if (max < map.get(num)) {
                max = map.get(num);
                res = num;
            } else if (max == map.get(num)) {
                res = Math.min(num,res);
            }

        }
        return res;
    }
}
