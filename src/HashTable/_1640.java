package HashTable;

import java.util.HashMap;
import java.util.HashSet;

public class _1640 {
    public static void main(String[] args) {

    }
    static public boolean canFormArray(int[] arr, int[][] pieces) {
        HashSet<String> set = new HashSet<>();
        for (int[] piece:pieces
             ) {
            StringBuffer str = new StringBuffer();
            for (int num:piece
                 ) {
                str.append(Integer.toString(num));
            }
            set.add(str.toString());
        }
        boolean canFormArray = false;
        StringBuffer runner = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            runner.append(Integer.toString(arr[i]));
            if(set.contains(runner.toString())){
                runner = new StringBuffer("");
                canFormArray = true;
            }else {
                canFormArray = false;
            }

        }
        return canFormArray;
    }
}
