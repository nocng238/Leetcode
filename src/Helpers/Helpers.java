package Helpers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Helpers {
    public static int gcd(int a, int b) {
        BigInteger res = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        return res.intValue();
    }

    public static int countDistinctElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }

    public int[] listToArray(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }

    public void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
