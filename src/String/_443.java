package String;

import java.util.ArrayList;
import java.util.List;

public class _443 {
    public static void main(String[] args) {

    }
    static public int compress(char[] chars) {
            int res = 0;
        int runner = 0;
        List<Character> ls = new ArrayList<>();
        while (runner < chars.length){
            int count = 1;
            while (runner < chars.length-1 && chars[runner] == chars[runner+1]){
                count++;
                runner++;
            }
            System.out.println(count);
            ls.add(chars[runner]);
            if (count != 1){
                String s = String.valueOf(count);
                for (char ch:s.toCharArray()
                     ) {
                    ls.add(ch);
                }
            }
            runner++;
        }
        for (int i = 0; i < ls.size(); i++) {
            chars[i] = ls.get(i);
        }



            return ls.size();
    }
}
