package Contest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class weekly393 {
    public static void main(String[] args) {
        System.out.println(findLatestTime("1?:?4"));
    }

    static public String findLatestTime(String s) {

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (i == 2)
                res.append(':');
            if (i == 0) {
                if (s.charAt(i) == '?') {
                    if (s.charAt(i) == '?' || Character.getNumericValue(s.charAt(i)) <= 2) {
                        res.append('1');
                    } else {
                        res.append(0);
                    }
                } else {
                    res.append(s.charAt(i));
                }
            }
            if (i == 1) {
                if (s.charAt(i) == '?') {
                    if (s.charAt(0) == '0') {
                        res.append('9');
                    } else {
                        res.append('1');
                    }
                } else {
                    res.append(s.charAt(i));
                }
            }

            if (i == 3) {
                if (s.charAt(i) == '?') {
                    res.append('5');
                } else {
                    res.append(s.charAt(i));
                }
            }
            if (i == 4) {
                if (s.charAt(i) == '?') {
                    res.append('9');
                } else {
                    res.append(s.charAt(i));
                }
            }

        }
        return res.toString();
    }

    static public int maximumPrimeDifference(int[] nums) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i]))
                primeList.add(i);
        }
        Collections.sort(primeList);

        return Math.abs(primeList.get(0) - primeList.get(primeList.size() - 1));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime
        }
        // Check divisibility only up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, not prime
            }
        }
        return true; // If not divisible by any number up to sqrt(num), prime
    }
}
