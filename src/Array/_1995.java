package Array;

public class _1995 {
    public static void main(String[] args) {
    int [] nums = {1,1,1,3,5};
    System.out.println(countQuadruplets(nums));
    }
    static public int countQuadruplets(int[] nums) {
//        O(n^4) solution
        int count = 0;
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2 ; j++) {
                for (int k = j+1; k <nums.length-1 ; k++) {
                    int total = nums[i]+nums[j]+nums[k];
                    int r = nums.length-1;
                    while (r != k){
                        if (nums[r] == total) count++;
                        r--;
                    }
                }
            }
        }
        return count;
//        O(n^2)
//        int res = 0;
//        int len = nums.length;
//
//        Map<Integer, Integer> count = new HashMap<>();
//        count.put(nums[len-1] - nums[len-2], 1);
//
//        for (int b = len - 3; b >= 1; b--) {
//            for (int a = b - 1; a >= 0; a--) {
//                res += count.getOrDefault(nums[a] + nums[b], 0);
//            }
//
//            for (int x = len - 1; x > b; x--) {
//                count.put(nums[x] - nums[b], count.getOrDefault(nums[x] - nums[b], 0) + 1);
//            }
//        }
//
//        return res;
    }
}
