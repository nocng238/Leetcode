package Contest;

import java.util.*;

public class weekly357 {
    public static void main(String[] args) {

    }
    static public String finalString(String s) {
        var res = new StringBuilder();
        for (char c: s.toCharArray()
             ) {
            if (c == 'i') res.reverse();
            else res.append(c);
        }
        return res.toString();
    }
    static public boolean canSplitArray(List<Integer> nums, int m) {


        return true;
    }
}
