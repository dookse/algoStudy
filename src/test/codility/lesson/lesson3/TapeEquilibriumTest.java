package codility.lesson.lesson3;

import org.junit.Before;
import org.junit.Test;

import static java.util.stream.IntStream.rangeClosed;
import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    private final int[] array_10_000 = rangeClosed(1, 10_000).toArray();
    private final int[] array_100_000 = rangeClosed(1, 100_000).toArray();
    private TapeEquilibrium tape;

    @Before
    public void setUp() {
        tape = new TapeEquilibrium();
    }

    @Test
    public void test_min() {
        int[] a = {1, 1};
        int result = tape.solution(a);
        assertEquals(0, result);
    }

    @Test
    public void test_double() {
        int[] a = {-1000, 1000};
        int result = tape.solution(a);
        assertEquals(2000, result);
    }

    @Test
    public void test_default() {
        int[] a = {3, 1, 2, 4, 3};
        int result = tape.solution(a);
        assertEquals(1, result);
    }

    @Test
    public void test_length5() {
        int[] a = {-10, -20, -30, -40, 100};
        int result = tape.solution(a);
        assertEquals(20, result);
    }

    @Test(timeout = 5)
    public void timeout_test() {
        tape.solution(array_10_000);
    }

    @Test(timeout = 10)
    public void max_timeout_test() {
        tape.solution(array_100_000);
    }

}