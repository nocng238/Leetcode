package Array;

import java.util.ArrayList;
import java.util.List;

public class _1089 {
    public static void main(String[] args) {

    }
    static public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num: arr
             ) {
            if (list.size()>= arr.length) break;
            if (num == 0){
                list.add(0);
                list.add(0);
            }else list.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
