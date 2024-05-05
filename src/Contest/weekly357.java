package Contest;

import java.util.*;

public class weekly357 {
    //https://leetcode.com/contest/weekly-contest-357/
    public static void main(String[] args) {

    }

    static public String finalString(String s) {
        var res = new StringBuilder();
        for (char c : s.toCharArray()
        ) {
            if (c == 'i') res.reverse();
            else res.append(c);
        }
        return res.toString();
    }

    static public boolean canSplitArray(List<Integer> nums, int m) {
        if (nums.size() <= 2) return true;
        for (int i = 1; i < nums.size(); i++)
            if (nums.get(i - 1) + nums.get(i) >= m) return true;
        return false;
    }

    static public int maximumSafenessFactor(List<List<Integer>> grid) {
        int res = 0;
         

        return res;
    }

    static void dfs(List<Integer> nums, List<List<Integer>> grid) {

    }
}
