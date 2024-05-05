package String;

public class _38 {
    public static void main(String[] args) {
        System.out.println((char) (48));
    }
    static public String countAndSay(int n) {
        if(n == 1) return "1";

        StringBuffer res = new StringBuffer("11");
        while(n > 2){ //havent get this yet
            StringBuffer temp = new StringBuffer();
            int runner = 0;
            while(runner< res.length()){
                int count = 1;
//                int charAtRunner = charToInt(temp.charAt(runner));
                while(runner < res.length() && res.charAt(runner) == res.charAt(runner+1)){
                    count++;
                    runner++;
                }

                temp.append((char)(count+48));
                temp.append(res.charAt(runner));
                runner++;
            }
            res = temp;
            n--;
        }


        return res.toString();
    }
    static int charToInt (char a){
        return a-30;
    }
}
