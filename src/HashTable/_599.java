package HashTable;

import java.util.*;;

public class _599 {
    public static void main(String[] args) {

    }

    static public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        int total = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (map.get(list2[i]) + i < total) {
                    res.clear();
                    res.add(list2[i]);
                }
                if (map.get(list2[i]) + i == total) {
                    res.add(list2[i]);
                }
                total = map.get(list2[i]) + i;
            }
        }

        return res.toArray(String[]::new);
    }
}
