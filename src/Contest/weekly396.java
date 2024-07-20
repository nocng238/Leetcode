package Contest;

import java.util.*;

public class weekly396 {
    public static void main(String[] args) {
        runTest1(new String[]{"234Adas", "b3", "a3$e"});
    }

    static public boolean isValid(String word) {
        if (word.length() < 3) return false;
        boolean containVowel = false;
        boolean containConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                containVowel = true;
                continue;
            }
            if (c > 47 && c < 58) {
                continue;
            }
            if (c > 96 && c < 123 || c > 64 && c < 91) {
                containConsonant = true;
                continue;
            }
            return false;

        }

        return containVowel && containConsonant;
    }

    static public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length();
        int groups = n / k;
        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < n; i += k) {
            String sub = word.substring(i, i + k);
            countMap.put(sub, countMap.getOrDefault(sub, 0) + 1);
        }

        int minOperations = groups - 1;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            minOperations -= Math.min(count, groups) - 1;
        }
        return minOperations;
    }

    static void runTest1(String[] words) {
        for (String word : words) {
            System.out.println(isValid(word));
        }
    }
}
