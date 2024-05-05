package Contest;

public class weekly391 {
    public static void main(String[] args) {

    }

    static public int sumOfTheDigitsOfHarshadNumber(int x) {
        int res = 0;
        int temp = x;
        while (temp != 0) {
            res += temp % 10;
            temp /= 10;
        }

        return x % res == 0 ? res : -1;
    }

    static public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            emptyBottles += 1 - numExchange;
            numExchange++;
            res++;
        }
        return res;
    }

    static public long countAlternatingSubarrays(int[] nums) {
        var res = 0;


        return res;
    }
}
