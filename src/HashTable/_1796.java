package HashTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class _1796 {
    public static void main(String[] args) {

    }
    static  public int secondHighest(String s) {
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch:arr
             ) {
            if (ch >=48 && ch <= 57) set.add(ch);
        }
        List<Character> ls = new ArrayList<>();
        for (Character ch : set
             ) {
            ls.add(ch);
        }
        Collections.sort(ls);
        if (ls.size() < 2) return -1;
        return ls.get(ls.size()-2) -48;
    }
}
