package Array;

import java.util.*;;

public class _2273 {
    public static void main(String[] args) {

    }

    static public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        words[0] = convertWord(words[0]);
        for (int i = 1; i < words.length; i++) {
            String wordConvert = convertWord(words[i]);
            if (!wordConvert.equals(words[i - 1])) {
                res.add(words[i]);
            }
            words[i] = wordConvert;
        }
        return res;
    }

    static String convertWord(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
