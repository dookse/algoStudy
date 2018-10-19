package codility.lesson.lesson3;

import static java.lang.Math.ceil;

public class FrogJmp {

    public int solution(final int x, final int y, final int d) {
        double jumpCount = (double) (y - x) / d;
        return (int) ceil(jumpCount);
    }

}
