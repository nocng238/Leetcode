import java.math.BigInteger;

public class algos {
    public static int gcd(int a, int b) {
        BigInteger res = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        return res.intValue();
    }
}
