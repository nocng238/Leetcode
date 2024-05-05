package HashTable;

import java.util.*;

public class _2094 {
    public static void main(String[] args) {

    }
    static public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        int[] digitCount = new int[10];
        Set<Integer> evenDigitSet = new HashSet<>();
        for (int digit:digits
             ) {
            digitCount[digit]++;
            evenDigitSet.add(digit);
        }
        for (Integer evenDigit:evenDigitSet
             ) {
            for (int i = 0; i < digits.length; i++) {
                if (digits[i]==0) continue;
                if(digits[i]==evenDigit && digitCount[evenDigit]<2) continue;//check 232
                for (int j = 0; j <digits.length; j++) {
                    // check case 322,222
                    if (j==i || (digits[j]==evenDigit && digitCount[evenDigit] < 3 && digits[i]==digits[j]) || (digits[j]==evenDigit && digitCount[evenDigit] < 2)) continue;
                    result.add(digits[i]*100+digits[j]*10+evenDigit);
                }
            }
        }
        int res[] = new int[result.size()];
        int index = 0;
        for (Integer num:result
             ) {
            res[index++] = num;
        }
        return res;
    }
}
