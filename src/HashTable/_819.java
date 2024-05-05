package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _819 {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = { "bob", "hit" };
        System.out.println(
                mostCommonWord(paragraph, banned));
    }

    static public String mostCommonWord(String paragraph, String[] banned) {
        String words[] = paragraph.toLowerCase().split("[ !?',;.]+");
        System.out.println(words.length);
        Set<String> bannedSet = new HashSet<String>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String res = null;
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                int count = map.getOrDefault(word, 0) + 1;
                map.put(word, count);
                if (count > maxCount) {
                    res = word;
                    maxCount = count;
                }
            }
        }
        return res;
    }
}
