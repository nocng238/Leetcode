package Array.Greedy;

import java.util.Arrays;

class _2017 {
    public static void main(String[] args) {
        // [[3,3,1],[8,5,2]]
        // [3 6 7] [7 4 1]
        // [8 13 15] [15 7 2]
        // [1,3,1,15],[1,3,3,1]
        // 2 3 3 ; 3 2 2
        int[][] a = { { 20, 3, 20, 17, 2, 12, 15, 17, 4, 15 }, { 20, 10, 13, 14, 15, 5, 2, 3, 14, 3 } };
        int c = 1;
        long b = c;
        //
        // System.out.println(b);
        // [1 4 5 20] [20 19 16 15]
        // [1 4 7 8] [8 7 4 1]
        System.out.println(gridGame(a));
        ;
    }

    static public long gridGame(int[][] grid) {
        // prefix and postfix
        long topSum = Arrays.stream(grid[0]).asLongStream().sum(), bottomSum = 0;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < grid[0].length; ++i) {
            topSum -= grid[0][i];
            ans = Math.min(ans, Math.max(topSum, bottomSum));
            bottomSum += grid[1][i];
        }
        return ans;
    }
}