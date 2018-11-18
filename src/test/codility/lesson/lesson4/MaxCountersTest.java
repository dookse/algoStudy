package codility.lesson.lesson4;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.fill;
import static java.util.stream.IntStream.rangeClosed;
import static org.junit.Assert.assertArrayEquals;

public class MaxCountersTest {

    private MaxCounters maxCounters;

    @Before
    public void setUp() {
        maxCounters = new MaxCounters();
    }

    @Test
    public void example() {
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int n = 5;
        int[] expecteds = {3, 2, 2, 4, 2};
        assertArrayEquals(expecteds, maxCounters.solution(n, a));
    }

    @Test
    public void length1_n1() {
        int[] a = {1};
        int n = 1;
        int[] expecteds = {1};
        assertArrayEquals(expecteds, maxCounters.solution(n, a));
    }

    @Test
    public void length3_n1() {
        int[] a = {1, 3, 2};
        int n = 2;
        int[] expecteds = {1, 2};
        assertArrayEquals(expecteds, maxCounters.solution(n, a));
    }

    @Test
    public void length10_n5() {
        int[] a = {2, 2, 2, 6, 3, 6, 6, 6, 6, 6};
        int n = 5;
        int[] expecteds = {4, 4, 4, 4, 4};
        assertArrayEquals(expecteds, maxCounters.solution(n, a));
    }

    @Test
    public void length50_n50() {
        int[] a = getArraysOfLength(50);
        int n = 50;
        int[] expecteds = new int[n];
        fill(expecteds, 1);
        assertArrayEquals(expecteds, maxCounters.solution(n, a));
    }

    @Test
    public void length100_000_n100_000() {
        int n = 100_000;

        int[] a = getArraysOfLength(n);
        a[3000] = 100_001;

        int[] expecteds = new int[n];
        fill(expecteds, 1);
        fill(expecteds, 3001, expecteds.length, 2);
        assertArrayEquals(expecteds, maxCounters.solution(n, a));
    }

    private int[] getArraysOfLength(final int length) {
        return rangeClosed(1, length).toArray();
    }
}