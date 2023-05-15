package Contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class weekly433 {
    public static void main(String[] args) {
        // [1,4,5,2,6,3]
        // [[4,3,5],[1,2,6]]
        int[] arr = { 1, 4, 5, 2, 6, 3 };
        int[][] a = new int[][] { { 4, 3, 5 }, { 1, 2, 6 } };
        firstCompleteIndex(arr, a);
        System.out.println(a.length);
    }

    static public int isWinner(int[] player1, int[] player2) {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        int turnThatHitTen1 = -1;
        int turnThatHitTen2 = -1;
        for (int i = 0; i < player1.length; i++) {
            if (turnThatHitTen1 == -1 || i > turnThatHitTen1 + 2) {
                scorePlayer1 += player1[i];
            } else {
                scorePlayer1 += player1[i] * 2;
            }
            if (turnThatHitTen2 == -1 || i > turnThatHitTen2 + 2) {
                scorePlayer2 += player2[i];
            } else {
                scorePlayer2 += player2[i] * 2;
            }
            if (player1[i] == 10) {
                turnThatHitTen1 = i;
            }
            if (player2[i] == 10) {
                turnThatHitTen2 = i;
            }
        }
        if (scorePlayer1 == scorePlayer2)
            return 0;
        return scorePlayer1 > scorePlayer2 ? 1 : 2;
    }

    static public int firstCompleteIndex(int[] arr, int[][] mat) {
        int res = 0;
        int[] row = new int[mat[0].length];
        int[] col = new int[mat.length];
        Arrays.fill(row, mat.length);
        Arrays.fill(col, mat[0].length);
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                map.put(mat[i][j], new int[] { i, j });
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int[] position = map.get(arr[i]);
            row[position[1]]--;
            col[position[0]]--;
            if (row[position[1]] == 0 || col[position[0]] == 0) {
                return i;
            }
        }
        return res;
    }

    static public int minimumCost(int[] start, int[] target, int[][] specialRoads) {

        return 0;
    }
}
