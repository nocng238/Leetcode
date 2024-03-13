package HashTable;

import java.util.HashSet;

public class _2154 {
    public static void main(String[] args) {

    }
    static public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums
             ) {
            set.add(num);
        }
        while(set.contains(original)){
            original *= 2;
        }
        return original;
    }
}
