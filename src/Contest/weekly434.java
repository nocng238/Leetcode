package Contest;

import java.util.*;
import java.util.stream.Collectors;

public class weekly434 {
  Map<Integer, Integer> map;
  int[] tracker;

  // 2671
  public weekly434() {
    this.map = new HashMap<>();
    this.tracker = new int[100000 + 1];
  }

  public void add(int number) {
    int prevFrequency = this.map.getOrDefault(number, 0) + 1;
    this.map.put(number, prevFrequency);
    this.tracker[prevFrequency]++;
    this.tracker[prevFrequency - 1]--;

  }

  public void deleteOne(int number) {
    if (this.map.containsKey(number) && this.map.get(number) > 0) {
      int prevFrequency = this.map.get(number);
      this.map.put(number, map.get(number) - 1);
      this.tracker[prevFrequency - 1]++;
      this.tracker[prevFrequency]--;
    }
  }

  public boolean hasFrequency(int frequency) {
    return this.tracker[frequency] > 0;
  }

  static public int[] distinctDifferenceArray(int[] nums) {
    int[] res = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      Set<Integer> prefixSet = new HashSet<>();
      Set<Integer> subfixSet = new HashSet<>();
      for (int j = 0; j <= i; j++) {
        prefixSet.add(nums[j]);
      }
      for (int j = i + 1; j < nums.length; j++) {
        subfixSet.add(nums[j]);
      }
      res[i] = prefixSet.size() - subfixSet.size();
    }
    return res;
  }

  static public int[] colorTheArray(int n, int[][] queries) {
    int[] res = new int[queries.length];
    int[] painted = new int[n];
    int curentAnswer = 0;
    int index = 0;
    for (int[] query : queries) {
      if (query[0] > 0) {
        if (painted[query[0]] != query[1] && painted[query[0] - 1] == query[1])
          curentAnswer++;
        if (painted[query[0]] != 0) {
          if (painted[query[0] - 1] == painted[query[0]])
            curentAnswer--;
        }
      }
      if (query[0] < n - 1) {
        if (painted[query[0]] != query[1] && painted[query[0] + 1] == query[1])
          curentAnswer++;
        if (painted[query[0]] != 0) {
          if (painted[query[0] + 1] == painted[query[0]])
            curentAnswer--;
        }
      }
      painted[query[0]] = query[1];
      res[index] = curentAnswer;
      index++;
    }
    return res;
  }
}
