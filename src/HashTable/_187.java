package HashTable;

import java.util.*;

public class _187 {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        StringBuffer str = new StringBuffer(s.substring(0, 10));
        str.deleteCharAt(0);
        str.append('D');
        System.out.println(str.toString());
    }

    static public List<String> findRepeatedDnaSequences(String s) {
        Set<String> resSet = new HashSet<>();
        Set<String> repeatedSet = new HashSet<>();
        List<String> res = new ArrayList<>();
        if (s.length() < 10) {
            return res;
        }
        StringBuffer str = new StringBuffer(s.substring(0, 10));
        repeatedSet.add(str.toString());
        for (int i = 10; i < s.length(); i++) {
            str.append(s.charAt(i));
            str.deleteCharAt(0);
            String newString = str.toString();
            if (repeatedSet.contains(newString)) {
                resSet.add(newString);
            } else
                repeatedSet.add(newString);
        }
        // str.
        return List.copyOf(resSet);
    }
}
