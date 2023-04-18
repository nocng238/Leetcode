package Contest.Weekly341;

import java.util.ArrayList;
import java.util.List;

public class _2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int maxOnesRow = 0;
        for (int i = 0; i < mat.length; i++) {
            int ones = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }
            if (ones > maxOnes) {
                maxOnes = ones;
                maxOnesRow = i;
            }
        }
        return new int[] { maxOnesRow, maxOnes };
    }
}
