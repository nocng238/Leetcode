package HashTable;

import java.util.HashSet;

public class _1496 {
    public static void main(String[] args) {
      int a = -57;
     System.out.println(Integer.toString(a));
    }
    static  public boolean isPathCrossing(String path) {
        int[] inital = {0,0};
        HashSet<String> set = new HashSet<>();
        set.add(arrToString(inital));
        for (char ch:path.toCharArray()
             ) {

            if (ch == 'N') inital[1]++;
            if (ch == 'S') inital[1]--;
            if (ch == 'E') inital[0]++;
            if (ch == 'W') inital[0]--;
            String temp = arrToString(inital);
            if (set.contains(temp) ) return true;
            set.add(temp);
        }
        return false;
    }
    static String arrToString (int[] arr){
        StringBuffer str = new StringBuffer();
        for (int a: arr
             ) {
            str.append(Integer.toString(a)+" ");
        }
        return str.toString();
    }
}
