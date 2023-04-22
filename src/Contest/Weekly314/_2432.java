package Contest.Weekly314;

public class _2432 {
    public static void main(String[] args) {
        int[] res = { 1, 2 };
        System.out.println(res[0]);
    }

    static public int hardestWorker(int n, int[][] logs) {
        int[] res = { logs[0][0], logs[0][1] };
        for (int i = 1; i < logs.length; i++) {
            int unitOfTime = logs[i][1] - logs[i - 1][1];
            if (unitOfTime > res[1]) {
                res[1] = unitOfTime;
                res[0] = logs[i][0];
            }
            if (unitOfTime == res[1]) {
                res[0] = Math.min(res[0], logs[i][0]);
            }
        }

        return res[0];
    }
}
