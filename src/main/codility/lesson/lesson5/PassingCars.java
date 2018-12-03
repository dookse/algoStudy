package codility.lesson.lesson5;

public class PassingCars {

    private static final int EAST = 0, WEST = 1, LIMIT_COUNT = 1_000_000_000;

    public int solution(final int[] a) {
        int eastCars = 0, passingCounts = 0;

        for (final int car : a) {
            if (car == WEST) {
                passingCounts += eastCars;
                if (passingCounts > LIMIT_COUNT) {
                    return -1;
                }
            } else if (car == EAST) {
                eastCars++;
            }
        }
        return passingCounts;
    }
}
