package HashTable;

import java.lang.reflect.Array;
import java.util.*;

public class _953 {
    public static void main(String[] args) {

    }
    // my dummy sol
    public boolean isAlienSorted(String[] words, String order) {
        int alienOrder[] = new int[27];
        int index = 0;
        String wordsClone[] = Arrays.copyOf(words,words.length);
        for (char ch:order.toCharArray()
        ) {
            alienOrder[ch-97] = index;
            index++;
        }
//        int i = 0;
//        Map<String,Integer> wordsIndex = new HashMap<>();
//        for (String word:words
//             ) {
//            wordsIndex.put(word,i);
//            i++;
//        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0; i < Math.min(o1.length(),o2.length()); i++) {
                    if (alienOrder[o1.charAt(i)-97] == alienOrder[o2.charAt(i)-97]) continue;
                    if (alienOrder[o1.charAt(i)-97] > alienOrder[o2.charAt(i)-97]) return 1;
                    else return -1;
                }
                if (o1.length() == o2.length())
                return 0;
                if (o1.length() > o2.length()) return 1; else return -1;
            }
        });
        for (int j = 0; j < words.length; j++) {
            if (words[j] != wordsClone[j]) return false;
        }


        return true;
    }
    /// someone's sol that is much better than mine
//    int[] mapping = new int[26];
//    public boolean isAlienSorted(String[] words, String order) {
//        for (int i = 0; i < order.length(); i++)
//            mapping[order.charAt(i) - 'a'] = i;
//        for (int i = 1; i < words.length; i++)
//            if (bigger(words[i - 1], words[i]))
//                return false;
//        return true;
//    }
//
//    boolean bigger(String s1, String s2) {
//        int n = s1.length(), m = s2.length();
//        for (int i = 0; i < n && i < m; ++i)
//            if (s1.charAt(i) != s2.charAt(i))
//                return mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
//        return n > m;
//    }
}
