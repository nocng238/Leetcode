package Contest;

public class weekly395 {
    public static void main(String[] args) {

    }

    static public int addedInteger(int[] nums1, int[] nums2) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            count1 += nums1[i];
            count2 += nums2[i];
        }
        return (count2 - count1) / (nums1.length);
    }

    static public int minimumAddedInteger(int[] nums1, int[] nums2) {
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            
        }

        return res;
    }
}
