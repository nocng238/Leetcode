package Stack;

public class _1963 {
    public static void main(String[] args) {
        // ]][][][[
        //    ][[]][][[][] => [[[]][][[]]]
    }

    static public int minSwaps(String s) {
        int res = 0;
        char[] brackets = {'[', ']'};
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < charArray.length / 2 - 1; i++) {
            if (length % 2 == 0) {
                if (charArray[i] != brackets[i % 2]) {
                    res++;
                }
            } else {
                if (charArray[i] == brackets[i % 2]) {
                    res++;
                }
            }

        }
        return res;
    }
}
