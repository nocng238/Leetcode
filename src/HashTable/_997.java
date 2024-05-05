package HashTable;

import java.util.*;

public class _997 {
    public static void main(String[] args) {

    }
    static public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int personisTrusted[] = new int[n+1];
        int personTrust[] = new int[n+1];
        for(int i =0 ;i<trust.length;i++) {
            personisTrusted[trust[i][1]]++;
            personTrust[trust[i][0]]++;
        }
        int count = 0;
        int res = -1;
        for (int i = 0; i < personisTrusted.length; i++) {
            if (personisTrusted[i] ==n-1 && personTrust[i] == 0) {
                count++;
                res = i;
            }
        }
        return count == 1 ? res:-1;
    }
}
