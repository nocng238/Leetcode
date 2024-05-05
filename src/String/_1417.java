package String;

import java.util.*;

public class _1417 {
    public static void main(String[] args) {

    }
    static public String reformat(String s) {
        StringBuffer res = new StringBuffer();
        List<Character> ch = new ArrayList<>();
        List<Character> num = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char charAtIndex = s.charAt(i);
            if (charAtIndex > 47 && charAtIndex < 58) ch.add(charAtIndex);
            else num.add(charAtIndex);
        }
        if (Math.abs(ch.size()-num.size()) > 1) return "";
        int i = 0;

        if (ch.size() > num.size()){

            while(res.length() < s.length()){
                if (i == s.length()/2){
                    res.append(ch.get(i));
                    break;
                }
                res.append(ch.get(i));
                res.append(num.get(i));
                i++;
            }
        } else if (ch.size() < num.size()) {
            while(res.length() < s.length()){
                if (i == s.length()/2){
                    res.append(num.get(i));
                    break;
                }
                res.append(num.get(i));
                res.append(ch.get(i));
                i++;
            }
        }else {
            while(res.length() < s.length()){
                res.append(num.get(num.size()-i-1));
                res.append(ch.get(i));
                i++;
            }
        }

        return res.toString();
    }
}
