package Array.DP_1D;

public class _5 {
    public static void main(String[] args) {

    }
    static  public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        int resLength = 0;
        String res  = "";
        //odd length
        for (int i = 1; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r<= s.length()-1 && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > resLength){
                    resLength = r - l +1;
                    res = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        // even length
        for (int i = 0; i <s.length() ; i++) {
            int l = i;
            int r = i+1;
            while (l >= 0 && r<= s.length()-1 && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > resLength){
                    resLength = r - l +1;
                    res = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
