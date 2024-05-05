package Array.DP_1D;

public class _647 {
    public static void main(String[] args) {

    }
    static int countSubStrings(String s){
        if(s.length() == 1) return 1;
        int res  = 0;
        //odd length
        for (int i = 1; i < s.length(); i++) {
            int l = i - 1;
            int r = i+1;
            while (l >= 0 && r<= s.length()-1 && s.charAt(l) == s.charAt(r)){
                res++;
                l--;
                r++;
            }
        }
        // even length
        for (int i = 0; i <s.length() ; i++) {
            int l = i;
            int r = i+1;
            while (l >= 0 && r<= s.length()-1 && s.charAt(l) == s.charAt(r)){
                res++;
                l--;
                r++;
            }
        }



        return res+s.length();
    }
}
