public class test {
    public static void main(String[] args) {
        String s = ".";
        try{
            int a = Integer.parseInt(s);
            System.out.print(a);
        }catch(Exception e){
            System.out.println(s);
        }
    }
}
