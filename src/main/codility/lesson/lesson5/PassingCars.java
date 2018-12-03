package codility.lesson.lesson5;

public class PassingCars {

    private static final int EAST = 0, WEST = 1;

    public int solution(final int[] a) {
        int eastCars = 0;
        int passingCounts = 0;

        for (final int car : a) {
            if (car == WEST) {
                passingCounts += eastCars;
                if (countExceedLimit(passingCounts)) {
                    return -1;
                }
            } else if (car == EAST) {
                eastCars++;
            }
        }
        return passingCounts;
    }

    private boolean countExceedLimit(final int passingCounts) {
        return passingCounts > 1_000_000_000;
    }
}
