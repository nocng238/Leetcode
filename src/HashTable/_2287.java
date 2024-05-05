package HashTable;

import java.util.*;

public class _2287 {
    public static void main(String[] args) {

    }
    static public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> charCountOfS = new HashMap<>();
        Map<Character,Integer> charCountOfTarget = new HashMap<>();

        int res = Integer.MAX_VALUE;
        for(char ch : s.toCharArray()) charCountOfS.put(ch,charCountOfS.getOrDefault(ch,0)+1);
        for(char ch : target.toCharArray()){
            charCountOfTarget.put(ch,charCountOfTarget.getOrDefault(ch,0)+1);
        }
        for(Character ch : charCountOfTarget.keySet()){
            res = Math.min(res,charCountOfS.getOrDefault(ch,0)/charCountOfTarget.get(ch));
        }
            return res;
    }
}
