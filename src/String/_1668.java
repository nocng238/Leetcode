package String;

public class _1668 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("aabaaaabaaaabaaa");
        System.out.println(str.substring(17));
        System.out.println("aabaa".contains("aaaba"));
        //"aaabaaaab aaaba aaaba aaaba aaaba aaaba"
        //"aaaba"
    }
    static public int maxRepeating(String sequence, String word) {
        int count=0;
        StringBuffer temp= new StringBuffer(word);
        while(true){
            if(sequence.contains(temp.toString())){
                count+=1;
                temp.append(word);
            }
            else{
                break;
            }
        }
        return count;
    }
}
