package codility.lesson.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    private Set<Integer> set;
    private int steps;

    public int solution(final int x, final int[] a) {
        initSteps(x);
        for (int seq = 0; seq < a.length; seq++) {
            goNextStep(a[seq]);
            if (isLastStep()) {
                return seq;
            }
        }
        return -1;
    }

    private void initSteps(int x) {
        set = new HashSet<>();
        steps = x;
    }

    private void goNextStep(int num) {
        if (set.add(num)) {
            steps--;
        }
    }

    private boolean isLastStep() {
        return steps == 0;
    }
}
