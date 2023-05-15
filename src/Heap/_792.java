package Heap;

import java.util.*;

public class _792 {
    int max = 0;
    TreeSet<Integer> set = new TreeSet<>();

    public _792() {
    }

    public boolean book(int start, int end) {
        boolean canRemoveStart = true;
        boolean canRemoveEnd = true;
        if (set.contains(start)) {
            canRemoveStart = false;
        }
        if (set.contains(end)) {
            canRemoveEnd = false;
        }
        set.add(start);
        set.add(end);
        int size = set.size();
        if (indexOf(set, start) == 0 && indexOf(set, end) == 1
                || indexOf(set, start) == size - 2 && indexOf(set, end) == size - 1) {
            return true;
        }
        if (canRemoveStart) {
            set.remove(start);
        }
        if (canRemoveEnd) {
            set.remove(end);
        }
        set.pollFirst();
        return false;
    }

    private int indexOf(TreeSet<Integer> set,
            Integer element) {

        int index = -1;

        // If the element exists in the TreeSet
        if (set.contains(element)) {

            // The element index will be equal to the
            // size of the headSet for the element
            index = set.headSet(element).size();
        }

        // Return the index of the element
        // Value will be -1 if the element
        // do not exist in the TreeSet
        return index;
    }
}
