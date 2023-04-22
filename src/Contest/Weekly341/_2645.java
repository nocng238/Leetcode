package Contest.Weekly341;

public class _2645 {
    public static void main(String[] args) {
        System.out.println(addMinimum("aba"));
    }

    public static int addMinimum(String word) {
        int res = 0;
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                if (i + 2 < charArray.length && charArray[i + 1] == 'b' && charArray[i + 2] == 'c') {
                    i += 2;
                    continue;
                }
                if (i + 1 < charArray.length && charArray[i + 1] != 'a') {
                    res += 1;
                    i++;
                    continue;
                }
                res += 2;
            }
            if (charArray[i] == 'b') {
                if (i + 1 < charArray.length && charArray[i + 1] == 'c') {
                    res += 1;
                    i++;
                    continue;
                }
                res += 2;
            }
            if (charArray[i] == 'c') {
                res += 2;
            }
        }
        return res;
    }
}
