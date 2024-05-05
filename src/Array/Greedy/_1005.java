package Array.Greedy;

import java.util.*;

public class _1005 {
    public static void main(String[] args) {
        int[] nums = {2,-3,-1,5,-4};
        System.out.println(largestSumAfterKNegations(nums,2));
    }
    static   public int largestSumAfterKNegations(int[] nums, int k) {
        int abs = 0;
        int negativeNums = 0;
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int num:nums
        ) {
            if (num<0) negativeNums++;
            list.add(num);
            abs+= Math.abs(num);

        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1*o1 - o2*o2;
            }
        });
//        for (Integer num: list
//             ) {
//            System.out.println(num);
//        }
        if (negativeNums == k){
            return abs;
        }else if (negativeNums >k ){
            int left = negativeNums-k;
            for(Integer num : list){
                if (num < 0 && left >0){
                    res+= num;
                    left--;
                }else {
                    res+= Math.abs(num);
                }
            }
            return res;
        }else{
            int left = negativeNums-k;
            if(left%2 == 0) return abs;

            return abs-2*Math.abs(list.get(0));

        }
    }

    }

