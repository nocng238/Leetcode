package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1753 {
    public static void main(String[] args) {

    }
    static public int maximumScore(int a, int b, int c) {
        int res = 0;
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        if (arr[0] + arr[1] >= arr[2]){
            res = arr[2] + (arr[1]+arr[0]-arr[2])/2;
        }else {
            res = arr[0]+arr[1];
        }

        return res;
    }

}
