package codility.lesson.lesson1;

import static java.lang.Integer.toBinaryString;
import static java.util.Arrays.stream;
import static java.util.Comparator.comparingInt;

public class BinaryGap {

    private static final String EMPTY = "";

    public int solution(final int n) {
        String binary = toBinaryString(n);
        String[] zeros = binary.split("1");

        if (binary.endsWith("0")) {
            zeros[zeros.length - 1] = EMPTY;
        }
        return getMaxLengthFrom(zeros);
    }

    private int getMaxLengthFrom(final String[] zeros) {
        return stream(zeros)
            .max(comparingInt(String::length))
            .orElse(EMPTY)
            .length();
    }
}