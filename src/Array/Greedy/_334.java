package Array.Greedy;

public class _334 {
    public static void main(String[] args) {

    }
    static public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int i =Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        for (int k:nums
             ) {
            if (k <= i) i = k;
            else if (k <= j) j = k;
            else {
                System.out.println(i+" "+j+" "+k);
                return true;
            }
        }


        return false;
    }
}
