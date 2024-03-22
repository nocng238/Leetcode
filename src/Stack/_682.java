package Stack;

import java.util.Stack;

public class _682 {
    public static void main(String[] args) {

    }

    static public int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> strStack = new Stack<>();
        for (String str : operations) {
            if (str.equals("C")) {
                strStack.pop();
                continue;
            }
            if (str.equals("D")) {
                strStack.push(strStack.peek() * 2);
                continue;

            }
            if (str.equals("+")) {
                int top = strStack.pop();
                int second = strStack.peek();
                int addedNum = top + second;
                strStack.push(top);
                strStack.push(addedNum);
                continue;

            }
            strStack.add(Integer.valueOf(str));

        }
        while (!strStack.isEmpty()) {
            res += strStack.pop();
        }

        return res;
    }
}
