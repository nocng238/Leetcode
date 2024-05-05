package TopInterview150.ArrayAndString;

import java.util.Arrays;

public class _88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0},num2 = {2,5,6};
        int m = 3,  n = 3;

    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        var res = new int[m+n];
        Arrays.fill(res,0);
        int mPointer = 0;
        int nPointer = 0;
        for (int i = 0; i < m+n; i++) {
            if(mPointer ==m){
                res[i]=nums2[nPointer];
                nPointer++;
                continue;
            }
            if(nPointer == n){
                res[i] = nums1[mPointer];
                mPointer++;
                continue;
            }
               if(nums1[mPointer] < nums2[nPointer]){
                   res[i]=nums1[mPointer];
                   mPointer++;
               }else{
                   res[i] = nums2[nPointer];
                   nPointer++;
               }
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = res[i];
        }
    }// O[1] space
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(i >=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }

        while(j >=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
