package Contest.Weekly312;

import java.util.Arrays;
import java.util.Comparator;

public class _2418 {
    public static void main(String[] args) {

    }
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < names.length-1; i++) {
            for (int j = i+1; j < names.length; j
                    ++) {
                if (heights[i] < heights[j]){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    int heightTemp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = heightTemp;
                }
            }
        }
        return names;
    }

}
