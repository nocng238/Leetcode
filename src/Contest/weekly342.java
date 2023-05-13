package Contest;

import java.util.*;

public class weekly342 {
    public static void main(String[] args) {
        int[] a = new int[] { 1, -1, -3, -2, 3 };
        // System.out.println(getSubarrayBeauty(a, 3, 2).length);
        for (int i : getSubarrayBeauty(a, 3, 2)) {
            System.out.println(i);
        }
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    static public int sumOfMultiples(int n) {
        int res = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && !set.contains(i)) {
                {
                    res += i;
                    set.add(i);
                }
            }
            if (i % 5 == 0 && !set.contains(i)) {
                res += i;
                set.add(i);
            }
            if (i % 7 == 0 && !set.contains(i)) {
                res += i;
                set.add(i);
            }

        }

        return res;
    }

    static public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] res = new int[nums.length - k + 1];
        int[] track = new int[150];
        for (int i = 0; i < k; i++) {
            track[nums[i] + 50]++;
        }
        int xClone = x;
        for (int i = 0; i < 50; i++) {
            if (track[i] > 0) {
                if (xClone - track[i] <= 0) {
                    res[0] = i - 50;
                    xClone -= track[i];
                    break;
                } else {
                    xClone -= track[i];
                }
            }
        }
        if (xClone > 0)
            res[0] = 0;
        for (int i = 0; i < nums.length - k; i++) {
            track[nums[i] + 50]--;
            track[nums[i + k] + 50]++;
            int xClone2 = x;
            for (int j = 0; j < 50; j++) {
                if (track[j] > 0) {
                    if (xClone2 - track[j] <= 0) {
                        res[i + 1] = j - 50;
                        xClone2 -= track[j];
                        break;
                    } else {
                        xClone2 -= track[j];
                    }
                }
            }
            if (xClone2 > 0)
                res[i + 1] = 0;
        }
        return res;
    }
}
