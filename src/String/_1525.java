package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _1525 {
    public static void main(String[] args) {
        char a = 97;
        System.out.println(a);
    }
    static public int numSplits(String s) {
        int res = 0;
        char[] charArray = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch: charArray
             ) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <charArray.length ; i++) {
            set.add(charArray[i]);
            if (map.get(charArray[i]) == 1) map.remove(charArray[i]);
            else map.put(charArray[i],map.get(charArray[i])-1);

            if (map.size() == set.size()) res++;
        }

        return res;
    }
//      O(n) time and O(1) space
    static public int numSplit2 (String s){
        int res = 0;
        int rightUnique = 0;
        int leftUnique = 0;
        char[] charArray = s.toCharArray();
        int[] rightCount = new int[27];
        int[] leftCount = new int[27];
        for (char ch :charArray
        ) {
            if(rightCount[ch-97] == 0) rightUnique++;
            rightCount[ch-97]++;
        }
        for (char ch: charArray
        ) {
            if (leftCount[ch-97] == 0) leftUnique++;
            leftCount[ch-97]++;
            if (rightCount[ch-97] == 1) rightUnique--;
            rightCount[ch-97]--;
            if (rightUnique == leftUnique) res++;
        }
        return res;
    }
}
