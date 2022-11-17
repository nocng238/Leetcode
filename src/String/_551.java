package String;

import java.util.Stack;

public class _551 {
    public static void main(String[] args) {

    }
    static public boolean checkRecord(String s) {
        char[] chArray = s.toCharArray();
        int countConsecutiveLate = 0;
        int countAbsent = 0;
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] =='L') {
                if (countConsecutiveLate == 2) return false;
                else countConsecutiveLate++;
            }else {
                if (chArray[i] == 'A') countAbsent++;
                countConsecutiveLate= 0;

            }
        }

        return (countAbsent >= 2) ? false : true;
    }
}
