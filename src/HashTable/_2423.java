package HashTable;

import java.util.*;

public class _2423 {
    public static void main(String[] args) {
        String word = "cccaa";
        equalFrequency(word);
    }

    static public boolean equalFrequency(String word) {
        int frequency[] = new int[26];
        for (char a : word.toCharArray()) {
            frequency[a - 97]++;
        }
        Set<Integer> set = new HashSet<>();
        for (int integer : frequency) {
            if (integer==0) {
                continue;
            }
            set.add(integer);
        }
        if (set.size() > 2||(set.size()==1 && !set.contains(1))) {
            return false;
        }
    
        
        int previous = 0;
        for (int i : set) {
            if (i == 0)
                continue;
            if (previous==0) {
                previous = i;
            }else{
                if (Math.abs(previous-i)==0 || Math.abs(previous-i)>1) {
                    return false;
                }
            }
            // if (ma) {

            // }
        }
        return true;
    }
}