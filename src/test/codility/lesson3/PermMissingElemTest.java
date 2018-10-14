package codility.lesson3;

import org.junit.Before;
import org.junit.Test;

import static java.util.stream.IntStream.rangeClosed;
import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    private PermMissingElem perm;

    @Before
    public void setUp() {
        perm = new PermMissingElem();
    }

    @Test
    public void test_empty() {
        int[] a = new int[]{};
        assertEquals(1, perm.solution(a));
    }

    @Test
    public void test_length_1() {
        int[] a = new int[]{2};
        assertEquals(1, perm.solution(a));
    }

    @Test
    public void test_length_2() {
        int[] a = new int[]{1, 3};
        assertEquals(2, perm.solution(a));
    }

    @Test
    public void test_length_3() {
        int[] a = new int[]{2, 3, 4};
        assertEquals(1, perm.solution(a));
    }

    @Test
    public void test_length_4() {
        int[] a = new int[]{2, 3, 1, 5};
        assertEquals(4, perm.solution(a));
    }

    @Test
    public void test_length_5() {
        int[] a = new int[]{1, 2, 3, 4};
        assertEquals(5, perm.solution(a));
    }

    @Test
    public void test_length_100() {
        int n = 12;
        int[] a = getMissingArray(100, n);
        assertEquals(n, perm.solution(a));
    }

    @Test
    public void test_length_1000() {
        int n = 242;
        int[] a = getMissingArray(1000, n);
        assertEquals(n, perm.solution(a));
    }

    @Test
    public void test_length_50000() {
        int n = 23212;
        int[] a = getMissingArray(50000, n);
        assertEquals(n, perm.solution(a));
    }

    @Test
    public void test_length_1000_000() {
        int n = 98483;
        int[] a = getMissingArray(1000_000, n);
        assertEquals(n, perm.solution(a));
    }

    private int[] getMissingArray(int size, int n) {
        return rangeClosed(1, size)
            .filter(a -> a != n)
            .toArray();
    }
}
