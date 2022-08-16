package HashTable;

import java.util.*;

public class _1128 {
    public static void main(String[] args) {

    }
    static  public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int ans = 0;
        for (int[] d : dominoes)
            ans += counts[Math.min(d[0], d[1])*10 + Math.max(d[0], d[1])]++;
        return ans;
    }

}
