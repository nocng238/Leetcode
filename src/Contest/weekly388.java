package Contest;

import java.util.*;

public class weekly388 {
    public static void main(String[] args) {

    }

    static public int minimumBoxes(int[] apple, int[] capacity) {
        int res = 0;
        Arrays.sort(capacity);
        int totalApples = 0;
        for (int i : apple) {
            totalApples += i;
        }
        for (int i = capacity.length - 1; i >= 0; i--) {
            if (totalApples <= 0) break;
            totalApples -= capacity[i];
            res++;

        }
        return res;
    }

    static public long maximumHappinessSum(int[] happiness, int k) {
        long res = 0;
        int n = happiness.length;
        Arrays.sort(happiness);
        int step = 0;
        for (int i = happiness.length - 1; k > 0; i--, k--, step++) {
            if (happiness[i] - step >= 0) res += happiness[i] - step;
        }
        return res;
    }

    static public String[] shortestSubstrings(String[] arr) {
        String[] res = new String[arr.length];


        return res;
    }
}
