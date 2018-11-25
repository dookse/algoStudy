package codility.lesson.lesson4;

import java.util.Arrays;

public class MissingInteger {

    private int index = 1, lastPositiveNum = 0;

    public int solution(final int[] a) {
        Arrays.sort(a);
        for (final int num : a) {
            if (isMissingNumber(num)) {
                return index;
            } else if (isNotMissingNumber(num)) {
                lastPositiveNum = num;
                index++;
            }
        }
        return index;
    }

    private boolean isMissingNumber(final int num) {
        return lastPositiveNum < num && num != index;
    }

    private boolean isNotMissingNumber(final int num) {
        return num == index;
    }

}
