package Contest.Biweeky94;

public class _2511 {
    public static void main(String[] args) {

    }

    static public int captureForts(int[] forts) {
        int max = 0;
        int current = 0;
        for (int i = 1; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (forts[current] != 0 && forts[i] != forts[current]) {
                    max = Math.max(max, Math.abs(i - current - 1));
                }
                current = i;
            }

        }

        return max;
    }

}
