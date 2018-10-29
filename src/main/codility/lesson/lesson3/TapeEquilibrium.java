package codility.lesson.lesson3;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class TapeEquilibrium {

    public int solution(final int[] a) {
        int sum = getSum(a),
            min = Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) {
            sum -= a[i - 1] * 2;
            min = min(min, abs(sum));
        }

        return min;
    }

    private int getSum(final int[] a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }
}
