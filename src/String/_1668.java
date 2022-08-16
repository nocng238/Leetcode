package String;

public class _1668 {
    public static void main(String[] args) {

    }
    static public int maxRepeating(String sequence, String word) {
            int res = 0;
            char[] arr = sequence.toCharArray();
            int m = word.length();
            if (!sequence.contains(word)) return 0;

        int count = 0;
        for (int i = 0; i < arr.length - m; i++) {
            if (arr[i] == arr[i + m]) {
                count++;
            } else {
                count = 0;
            }

        }


            return res;
    }
}
