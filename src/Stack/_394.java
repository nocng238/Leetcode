package Stack;

import java.util.Stack;

public class _394 {
    public static void main(String[] args) {
        System.out.println("hello world");
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        StringBuilder out = new StringBuilder();
        char[] arr = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        Stack<StringBuilder> stck = new Stack<>();
        int encountered = 0;
        int digit = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ']' && arr[i] != '[') {
                temp.append(arr[i]);
                continue;
            }
            if (arr[i] == ']') {
                if (encountered == 0) {
                    out.append(temp.toString());
                    temp = new StringBuilder();
                } else {
                    stck.push(temp);
                    temp = new StringBuilder();
                }
                encountered++;
                continue;
            }
            if (arr[i] == '[') {
                encountered--;
                StringBuilder digitStr = new StringBuilder();
                while (i - 1 >= 0 && Character.isDigit(arr[i - 1])) {
                    digitStr.append(arr[i - 1]);
                    i--;
                }
                digit = Integer.parseInt(digitStr.reverse().toString());
                if (encountered == 0) {
                    for (int j = 0; j < digit; j++) {
                        out.append(temp.toString());
                    }
                    temp = new StringBuilder();
                } else {
                    String here = temp.toString();
                    temp = new StringBuilder();
                    temp.append(stck.pop());
                    for (int j = 0; j < digit; j++) {
                        temp.append(here);
                    }
                }
                continue;
            }

        }
        out.append(temp.toString());
        return out.reverse().toString();
    }
}
