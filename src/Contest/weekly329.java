package Contest;

import java.util.Arrays;
import java.util.Comparator;

public class weekly329 {
    static public int alternateDigitSum(int n) {
        int res = 0;
        char[] digits = Integer.toString(n).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            res += (digits[i] - 48) * Math.pow(-1, i);
        }
        return res;
    }

    static public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] arg0, int[] arg1) {
                // TODO Auto-generated method stub
                return arg0[k] - arg1[k];
            }
        });
        return score;
    }

    static public boolean makeStringsEqual(String s, String target) {
        
        return true;
    }
}
