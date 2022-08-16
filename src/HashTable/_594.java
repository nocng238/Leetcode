package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class _594 {
    public static void main(String[] args) {

    }
    static  public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums
             ) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for (Integer key:map.keySet()
             ) {
            if (map.containsKey(key+1)){
                max = Math.max(max,map.get(key)+map.get(key+1));
            }
        }
        return max;
    }
}
