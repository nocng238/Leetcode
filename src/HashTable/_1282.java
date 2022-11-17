package HashTable;

import java.util.*;

public class _1282{
    public static void main(String[] args) {
        
    }
    static public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
            List<Integer> subList = map.get(groupSizes[i]);
            if (subList.size() == groupSizes[i]) {
                res.add(subList);
                map.remove(groupSizes[i]);
            }
        }
        return res;
    }
}