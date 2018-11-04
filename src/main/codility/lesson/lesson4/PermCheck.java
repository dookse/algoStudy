package codility.lesson.lesson4;

import static java.util.Arrays.sort;

public class PermCheck {

    public int solution(final int[] a) {
        sort(a);
        int seq = 1;
        for (int num : a) {
            if (isNotSequential(seq++, num)) {
                return 0;
            }
        }
        return 1;
    }

    private boolean isNotSequential(final int seq, final int a) {
        return seq != a;
    }
}
