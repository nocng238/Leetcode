package String;

public class _2269 {
    public static void main(String[] args) {

    }
    static public int divisorSubstrings(int num, int k) {
        int res = 0;
        String s = Integer.toString(num);
        for(int i = 0;i <= s.length()-k;i++){
            int sub = Integer.parseInt(s.substring(i,i+k));
            if (num%sub == 0) res++;
        }
        return res;
    }
}
