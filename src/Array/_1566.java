package Array;

public class _1566 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,3};
        System.out.println(containsPattern(arr,2,3));

    }
//    My solution
    static public boolean containsPattern(int[] arr, int m, int k) {
      outer:  for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+m; j <arr.length-m ; j+=m) {
                for (int l = j; l < j+m ; l++) {
                    if (arr[l] != arr[l-m])  continue outer;
                }
                count++;
                if (count == k-1) return true;
            }
        }

        return false;
    }
//    Someone's solution with O(n) time and O(1) space
    static public boolean containsPattern2(int arr[], int m, int k){
        int count = 0;
        for (int i = 0; i < arr.length - m; i++) {
            if (arr[i] == arr[i + m]) {
                count++;
            } else {
                count = 0;
            }
            if (count == m * (k-1)) {
                return true;
            }
        }
        return false;
    }
}
