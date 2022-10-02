package Contest.Weekly313;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _2429 {
    public static void main(String[] args) {
        System.out.println( minimizeXor(1,12));

    }
    //Firstly we need to know the number of set bits of num1 and num2.
    //Let a = bitCount(num1) and b = bitCount(num2).
    //
    //If a == b, we can pick x = num1 and x XOR num1 = 0 is minimal.
    //
    //Explanation
    //If a > b, we can pick x equals the bigger b bits of num1,
    //so that we can XOR the bigger b bits of num1,
    //and keep the smaller a - b bits left to make result small.
    //
    //If a < b, we can firstly pick x = num1,
    //and additionaly we need to pick b - a more bits that not in num1.
    //We check from the smaller bits until x have b bits.
    // MUCH BETTER SOL BUT HARD TO UNDERSTAND
    public int minimizeXor2(int num1, int num2) {
        int a = Integer.bitCount(num1), b = Integer.bitCount(num2), res = num1;
        for (int i = 0; i < 32; ++i) {
            if (a > b && ((1 << i) & num1) > 0) {
                res ^= 1 << i;
                a--;
            }
            if (a < b && ((1 << i) & num1) == 0) {
                res ^= 1 << i;
                a++;
            }
        }
        return res;
    }
    //MY DUMMY SOL
    static public int minimizeXor(int num1, int num2) {
        int bitCountOfNum2 = Integer.bitCount(num2);
        String binaryOfNum1 = Integer.toBinaryString(num1);
        char resInBinary[] = new char[Math.max(binaryOfNum1.length(),bitCountOfNum2)];
        Arrays.fill(resInBinary,'0');
        for (int i = 0; i < binaryOfNum1.length(); i++) {
            if(bitCountOfNum2==0) break;
            if (binaryOfNum1.charAt(i)=='1') {
                resInBinary[i] = '1';
                bitCountOfNum2--;
            }
            else resInBinary[i]='0';
        }
        int r = resInBinary.length-1;
        while (bitCountOfNum2>0){

            while(resInBinary[r] != '0') {
                r--;
            }
            resInBinary[r] = '1';
            bitCountOfNum2--;
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < resInBinary.length; i++) {
            res.append(resInBinary[i]);
        }
        return Integer.parseInt(res.toString(),2);
    }
}
