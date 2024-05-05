package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Helpers.Helpers;

public class weekly387 {
    public static Helpers helpers = new Helpers();

    public static void main(String[] args) {


        int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        countSubmatrices(mat, 10);
    }

    static public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        if (nums.length < 3) return nums;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (arr1.getLast() > arr2.getLast()) {
                arr1.add(nums[i]);

            } else arr2.add(nums[i]);
        }
        arr1.addAll(arr2);
        return arr1.stream().mapToInt(i -> i).toArray();
    }

    static public int countSubmatrices(int[][] grid, int k) {
        int res = 0;
        int[][] prefixSum = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (j == 0) {
                    prefixSum[i][j] = grid[i][j];
                } else prefixSum[i][j] = prefixSum[i][j - 1] + grid[i][j];
            }
        }
        helpers.print2D(prefixSum);
        for (int j = 0; j < prefixSum[0].length; j++) {
            int prefixTemp = 0;
            for (int i = 0; i < prefixSum.length; i++) {
                prefixTemp += prefixSum[i][j];
                if (prefixTemp <= k) {
                    res += 1;
                }
            }
        }
        return res;
    }

    static public int minimumOperationsToWriteY(int[][] grid) {
        int n = grid.length;
        int res = n * n;

        int[] notBelongYCounter = new int[3];
        int[] belongYCounter = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                /*
                The diagonal starting at the top-left cell and ending at the center cell of the grid.
                The diagonal starting at the top-right cell and ending at the center cell of the grid.*/
                if ((i == j || i == n - 1 - j) && i < n / 2) {
                    belongYCounter[grid[i][j]]++;
                    continue;
                }
                //The vertical line starting at the center cell and ending at the bottom border of the grid.
                if (j == n / 2 && i >= n / 2) {
                    belongYCounter[grid[i][j]]++;
                    continue;
                }
                notBelongYCounter[grid[i][j]]++;
            }
        }
        int totalCellsBelongToY = n + n / 2;
        int totalCellsNotBelongToY = n * n - totalCellsBelongToY;
        for (int i = 0; i < notBelongYCounter.length; i++) {
            for (int j = 0; j < belongYCounter.length; j++) {
                if (i != j) {
                    int steps = (totalCellsNotBelongToY - notBelongYCounter[i]) + (totalCellsBelongToY - belongYCounter[j]);
                    res = Math.min(res, steps);
                }
            }
        }
        return res;
    }

}
