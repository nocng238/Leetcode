package Contest;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class weekly380 {
    public static void main(String[] args) {
int[] nums = {1,2,2,3,1,4};
//        String testStr = "ngocpro123";
//        System.out.println(testStr.indexOf("3n",-1));
        String s = "isawsquirrelnearmysquirrelhouseohmy",  a = "my", b = "squirrel"; int k = 15;
//        for (int i : beautifulIndices(s,a,b,k)){
//            System.out.println(i);
//        }
        List<Integer> list = Arrays.asList(1, 3, 5, 8, 58);
        int target = 90;

        int[] indices = findAdjacentIndices(list, target);
        int leftIndex = indices[0];
        int rightIndex = indices[1];

        System.out.println("Left adjacent index: " + leftIndex);
        System.out.println("Right adjacent index: " + rightIndex);
    }
    //1st
    public static int maxFrequencyElements(int[] nums) {
        int[] arr1 = new int[101];
        for (int num : nums) {
            arr1[num] = arr1[num] + 1;
        }
        int max = 0 ;
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
         {
            max = Math.max(max,arr1[i]);
        }
        System.out.println(max);
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == max){
                count++;
            }
        }
        return count * max;
    }

    static public List<Integer> beautifulIndices(String s, String a, String b, int k) {
    List<Integer> res = new ArrayList<>();
        List<Integer> indexesA = new ArrayList<>();
        List<Integer> indexesB = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(i<=s.length()-a.length() && a.equals(s.substring(i,i+a.length()))){
                indexesA.add(i);
            }
            if(i<=s.length()-b.length() && b.equals(s.substring(i,i+b.length()))){
                indexesB.add(i);
            }
        }
        for(int i : indexesA){
            for( int j : indexesB){
                int temp = Math.abs(i-j);
                if( temp < k || temp == k) {
                    res.add(i);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }
    public static int[] findAdjacentIndices(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        int leftIndex = -1;
        int rightIndex = -1;

        // Find left adjacent index
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                leftIndex = mid;
                right = mid - 1; // Continue search in the left half
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Reset left and right pointers
        left = 0;
        right = list.size() - 1;

        // Find right adjacent index
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                rightIndex = mid;
                left = mid + 1; // Continue search in the right half
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (leftIndex == -1 && rightIndex == -1) {
            // If the target number is not found in the list, return the indices where it would be inserted
            leftIndex = right;
            rightIndex = left;
        }

        return new int[]{leftIndex, rightIndex};
    }
}

