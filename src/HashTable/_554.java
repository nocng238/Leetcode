package HashTable;

import java.util.*;

public class _554 {
    public static void main(String[] args) {
        int[] a = { 1, 2 };
        int[] b = { 1, 2 };
        System.out.println(a == b);
    }

    public int leastBricks(List<List<Integer>> wall) {
        int res = 0;
        int wallSize = wall.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int totalOnTheLeft = 0;
            int rowSize = row.size();
            for (int i = 0; i < rowSize - 1; i++) {
                totalOnTheLeft += row.get(i);
                int tempVal = map.getOrDefault(totalOnTheLeft, 0) + 1;
                res = Math.max(tempVal, res);
                map.put(totalOnTheLeft, tempVal);
            }

        }
        return wallSize - res;
    }
}
