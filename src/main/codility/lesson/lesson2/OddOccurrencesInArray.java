package codility.lesson.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution(final int[] a) {
        Set<Integer> set = new HashSet<>();

        for (int num : a) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        return set.iterator().next();
    }
}
