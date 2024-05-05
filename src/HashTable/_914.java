package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class _914 {
    public static void main(String[] args) {
        int[] deck = {1,1,2,2,2,2};
        System.out.println(hasGroupsSizeX(deck));
    }
    static public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : deck){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans= 0;
        for (Integer key : map.keySet()) {
            ans = gcd(ans, map.get(key));
        }

        if (ans >= 2) {
            return true;
        }

        return false;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

}
