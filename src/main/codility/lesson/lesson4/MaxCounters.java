package codility.lesson.lesson4;

import static java.lang.Math.max;

public class MaxCounters {

    private int currentMaxValue, maxCount, counterCheckValue, lastCounterIndex = 0;

    public int[] solution(final int n, final int[] a) {
        int[] result = init(n, a);
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            switch (getOperation(num)) {
                case MAX_COUNTER:
                    maxCounter(result, i);
                    break;
                case INCREASE:
                    increase(result, num);
                    break;
            }
        }
        return result;
    }

    private void maxCounter(final int[] ans, final int idx) {
        if (lastCounterIndex == idx) {
            for (int i = 0; i < ans.length; i++) {
                ans[i] = currentMaxValue;
            }
        }
        maxCount = currentMaxValue;
    }

    private void increase(final int[] result, final int i) {
        if (maxCount > result[i - 1]) {
            result[i - 1] = maxCount;
        }
        currentMaxValue = max(++result[i - 1], currentMaxValue);
    }

    private int[] init(final int n, final int[] a) {
        int[] result = new int[n];
        counterCheckValue = n + 1;
        lastCounterIndex = getLastCounterIndex(a);
        return result;
    }

    private Operations getOperation(final int num) {
        if (isMaxCounter(num)) {
            return Operations.MAX_COUNTER;
        } else {
            return Operations.INCREASE;
        }
    }

    private int getLastCounterIndex(final int[] a) {
        int counterIndex = -1;
        for (int i = a.length - 1; i > -1; i--) {
            if (isMaxCounter(a[i])) {
                counterIndex = i;
                break;
            }
        }
        return counterIndex;
    }

    private boolean isMaxCounter(final int num) {
        return num == counterCheckValue;
    }

    enum Operations {
        INCREASE,
        MAX_COUNTER
    }

}
