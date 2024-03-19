package TopInterview150.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class _27 {
    public static void main(String[] args) {


    }
    static public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i :nums){
            if(i != val) {
                nums[k]=i;
                k++;
            }
        }
        return nums.length-k;
    }
}
