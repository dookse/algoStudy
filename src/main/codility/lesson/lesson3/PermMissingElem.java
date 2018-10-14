package codility.lesson.lesson3;

import static java.util.Arrays.sort;

public class PermMissingElem {

    public int solution(final int[] a) {
        sort(a);
        for (int i = 0; i < a.length; i++) {
            int next = i + 1;
            if (isNextValueMissing(next, a[i])) {
                return next;
            }
        }
        return a.length + 1;
    }

    private boolean isNextValueMissing(final int next, final int curr) {
        return next != curr;
    }
}
