package Array;

import java.util.*;

public class _1189 {
    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {
        char[] arr = text.toCharArray();
        int res = Integer.MAX_VALUE;
        Set<Character> set = new HashSet<>(Arrays.asList('b', 'a', 'l', 'o', 'n'));
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : arr) {
            if (set.contains(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        for (Character character : set) {
            if (!map.containsKey(character)) {
                return 0;
            }
            if (character == 'l' || character == 'o') {
                res = Math.min(res, map.get(character) / 2);
            } else
                res = Math.min(res, map.get(character));
        }
        return res;
    }
}
