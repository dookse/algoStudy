package codility.lesson4;

import org.junit.Before;
import org.junit.Test;

import static java.util.stream.IntStream.rangeClosed;
import static org.junit.Assert.*;

public class PermCheckTest {

    private final int[] array_10_000 = rangeClosed(1, 10_000).toArray();
    private final int[] array_100_000 = rangeClosed(1, 100_000).toArray();
    private PermCheck permCheck;

    @Before
    public void setUp() {
        permCheck = new PermCheck();
    }

    @Test
    public void example1() {
        int[] a = {4, 1, 3, 2};
        assertEquals(1, permCheck.solution(a));
    }

    @Test
    public void example2() {
        int[] a = {4, 1, 3};
        assertEquals(0, permCheck.solution(a));
    }

    @Test
    public void length1_true() {
        int[] a = {1};
        assertEquals(1, permCheck.solution(a));
    }

    @Test
    public void length1_false() {
        int[] a = {2};
        assertEquals(0, permCheck.solution(a));
    }

    @Test
    public void length2_true() {
        int[] a = {1, 2};
        assertEquals(1, permCheck.solution(a));
    }

    @Test
    public void length2_false() {
        int[] a = {2, 3};
        assertEquals(0, permCheck.solution(a));
    }

    @Test
    public void length3_true() {
        int[] a = {3, 1, 2};
        assertEquals(1, permCheck.solution(a));
    }

    @Test
    public void length3_false() {
        int[] a = {4, 2, 1};
        assertEquals(0, permCheck.solution(a));
    }

    @Test
    public void length10_true() {
        int[] a = {1, 2, 4, 5, 6, 7, 8, 9, 10, 3};
        assertEquals(1, permCheck.solution(a));
    }

    @Test
    public void length10_false() {
        int[] a = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        assertEquals(0, permCheck.solution(a));
    }

    @Test
    public void length100_000_true() {
        int[] a = rangeClosed(1, 100_000).toArray();
        assertEquals(1, permCheck.solution(a));
    }

    @Test
    public void length100_000_false() {
        int[] a = rangeClosed(1, 100_000).toArray();
        a[0] = 100_001;
        assertEquals(0, permCheck.solution(a));
    }

    @Test(timeout = 5)
    public void timeout_test() {
        permCheck.solution(array_10_000);
    }

    @Test(timeout = 10)
    public void timeout_test2() {
        permCheck.solution(array_100_000);
    }
}