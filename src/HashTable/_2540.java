package HashTable;

import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _2540 {
    public static void main(String[] args) {

    }

    static public int getCommon(int[] nums1, int[] nums2) {
        int res = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int integer : nums1) {
            set.add(integer);
        }
        for (int integer : nums2) {
            if (set.contains(integer)) {
                res = Math.min(integer, res);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
