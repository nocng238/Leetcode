package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _1346 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    static  public boolean checkIfExist(int[] arr) {
        HashSet<Integer> nums = new HashSet<>();
        HashSet<Integer> doubleNums = new HashSet<>();
        for (int num: arr
             ) {
            if (!nums.contains(num*2) && !doubleNums.contains(num)) {
                nums.add(num);
                doubleNums.add(num*2);
            }else return true;
        }

        return  false;
    }
}
