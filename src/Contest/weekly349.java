package Contest;

public class weekly349 {
    public static void main(String[] args) {

        System.out.println(smallestString("aa"));
    }
    static  public String smallestString(String s) {
        var res = "";
        var subStringNeedToChange = "";
        var subArray = s.split("a");
        if(subArray.length == 0){
            return s.substring(0, s.length()-1) + 'z';
        }
        for (String string : subArray) {
            if(string.length() > 0){
                subStringNeedToChange = string;
                break;
            }
        }
        var changedString = new StringBuffer();
        for (int i = 0; i < subStringNeedToChange.length(); i++) {
            int charNum = subStringNeedToChange.charAt(i) - 1;
            changedString.append((char) charNum);
        }
        res = s.replaceFirst(subStringNeedToChange, changedString.toString());
        return res;
    }
    static public long minCost(int[] nums, int x) {
        var res = 0;   
        
        return res;
    }
}
