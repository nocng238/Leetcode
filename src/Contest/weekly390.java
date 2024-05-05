package Contest;

import java.util.*;

public class weekly390 {
    public static void main(String[] args) {
//        minOperations(124);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
//        pq.remove(2);
        System.out.println(pq);
    }

    static public int maximumLengthSubstring(String s) {
        var res = 0;
        char[] chars = s.toCharArray();
        int l = 0, r = 0;
        int[] freq = new int[26];
        while (r < chars.length) {
            if (freq[chars[r] - 97] < 2) {
                freq[chars[r] - 97]++;
                r++;
            } else {
                freq[chars[l] - 97]--;
                l++;
            }
            int temp = r - l;
            res = Math.max(res, temp);
        }

        return res;
    }

    static public int minOperations(int k) {
        if (k == 0 || k == 1) return 0;
        if (k == 2) return 1;
        int a = 1;
        int b = 1;
        while (true) {
            if (a * a == k) {
                b = a;
                break;
            }
            if (a * (a + 1) >= k) {
                b = a + 1;
                break;
            }
            a++;
        }
        return a + b - 2;
    }

    static public long[] mostFrequentIDs(int[] nums, int[] freq) {
        long[] res = new long[nums.length];
        Map<Integer, Long> map = new HashMap<>();
        Map<Long, Long> freqMap = new HashMap<>();
        SortedSet<Long> sortedSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            long prevFreq = map.getOrDefault(nums[i], (long) 0);
            long addedFreq = prevFreq + freq[i];
            freqMap.put(prevFreq, freqMap.getOrDefault(prevFreq, (long) 0) - 1);
            freqMap.put(addedFreq, freqMap.getOrDefault(addedFreq, (long) 0) + 1);
            map.put(nums[i], addedFreq);
            sortedSet.add(addedFreq);
            if (freqMap.getOrDefault(prevFreq, (long) 0) <= 0) {
                sortedSet.remove(prevFreq);
            }
            System.out.println(freqMap);
            res[i] = sortedSet.isEmpty() ? 0 : sortedSet.first();
        }
        return res;
    }

}
