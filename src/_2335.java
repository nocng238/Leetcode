public class _2335 {
    public static void main(String[] args) {

    }

    static public int fillCups(int[] A) {
        int mx = 0, sum = 0;
        for (int a : A) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
}
