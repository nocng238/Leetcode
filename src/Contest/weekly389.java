package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class weekly389 {
    public static void main(String[] args) {

    }

    static public boolean isSubstringPresent(String s) {
        StringBuffer clone = new StringBuffer(s);
        String reverse = clone.reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if (reverse.contains(s.substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }

    static public long countSubstrings(String s, char c) {
        long res = 0;
        char[] charArray = s.toCharArray();
        List<Integer> cIndexes = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) cIndexes.add(i);
        }

        int length = cIndexes.size();
        return ((long) length * (length + 1) / 2);
    }

    static public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        int res = 0;
        for (char ch : word.toCharArray()) {
            freq[122 - ch] = freq[122 - ch] + 1;
        }
        Arrays.sort(freq);
        for (int j : freq) {
            if (j == 0) continue;
            if (freq[freq.length - 1] - j > k) res += freq[freq.length - 1] - k - j;
        }
        return res;
    }
}
