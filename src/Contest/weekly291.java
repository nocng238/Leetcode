package Contest;

import java.util.*;

public class weekly291 {
    public static int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                res = Math.min(res, i - map.get(cards[i]) + 1);
                map.put(cards[i], i);
            } else {
                map.put(cards[i], i);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static int getNumberOfDitgits(int n) {
        return Integer.toString(n).length();
    }

    public int countDistinct(int[] nums, int k, int p) {
        int res = 0;
        // firstof need to get all index of numbers that divisible by p
        List<Integer> indexOfAllNumbersDivisibleByP = new ArrayList<>();
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % p == 0)
                indexOfAllNumbersDivisibleByP.add(i);
        }
        if (indexOfAllNumbersDivisibleByP.size() <= k) {
            return nums.length * (nums.length + 1) / 2;
        }
        Set<String> resultSet = new HashSet<>();
        while (left < right) {
            for (int i = left; i < right; i++) {
                for (int j = i; j < right; j++) {

                }
            }
        }

        return res;
    }
}
