package codility.lesson.lesson2;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @Before
    public void setUp() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void empty_array() {
        int[] a = {};
        assertEqualsArray(a, cyclicRotation.solution(a, 0));
        assertEqualsArray(a, cyclicRotation.solution(a, 1));
        assertEqualsArray(a, cyclicRotation.solution(a, 2));
        assertEqualsArray(a, cyclicRotation.solution(a, 3));
    }

    @Test
    public void array_size_1() {
        int[] a = {1};
        assertEqualsArray(a, cyclicRotation.solution(a, 0));
        assertEqualsArray(a, cyclicRotation.solution(a, 1));
        assertEqualsArray(a, cyclicRotation.solution(a, 2));
        assertEqualsArray(a, cyclicRotation.solution(a, 3));
    }

    @Test
    public void array_size_2() {
        int[] a = {1, 2};
        assertEqualsArray(new int[]{2, 1}, cyclicRotation.solution(a, 1));
        assertEqualsArray(new int[]{1, 2}, cyclicRotation.solution(a, 2));
    }

    @Test
    public void array_size_3() {
        int[] a = {1, 2, 3};
        assertEqualsArray(new int[]{3, 1, 2}, cyclicRotation.solution(a, 1));
        assertEqualsArray(new int[]{2, 3, 1}, cyclicRotation.solution(a, 2));
        assertEqualsArray(new int[]{1, 2, 3}, cyclicRotation.solution(a, 3));
    }

    @Test
    public void array_size_4() {
        int[] a = {1, 2, 3, 4};
        assertEqualsArray(new int[]{4, 1, 2, 3}, cyclicRotation.solution(a, 1));
        assertEqualsArray(new int[]{3, 4, 1, 2}, cyclicRotation.solution(a, 2));
        assertEqualsArray(new int[]{2, 3, 4, 1}, cyclicRotation.solution(a, 3));
        assertEqualsArray(new int[]{1, 2, 3, 4}, cyclicRotation.solution(a, 4));
        assertEqualsArray(new int[]{4, 1, 2, 3}, cyclicRotation.solution(a, 5));
    }

    @Test
    public void array_size_5() {
        int[] a = {3, 8, 9, 7, 6};
        assertEqualsArray(new int[]{6, 3, 8, 9, 7}, cyclicRotation.solution(a, 1));
        assertEqualsArray(new int[]{7, 6, 3, 8, 9}, cyclicRotation.solution(a, 2));
        assertEqualsArray(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(a, 3));
        assertEqualsArray(new int[]{8, 9, 7, 6, 3}, cyclicRotation.solution(a, 4));
        assertEqualsArray(new int[]{3, 8, 9, 7, 6}, cyclicRotation.solution(a, 5));
    }

    @Test
    public void array_size_6() {
        int[] a = {-1000, -200, 0, 100, 600, 1000};
        assertEqualsArray(new int[]{1000, -1000, -200, 0, 100, 600}, cyclicRotation.solution(a, 1));
        assertEqualsArray(new int[]{600, 1000, -1000, -200, 0, 100}, cyclicRotation.solution(a, 2));
        assertEqualsArray(new int[]{100, 600, 1000, -1000, -200, 0}, cyclicRotation.solution(a, 3));
        assertEqualsArray(new int[]{0, 100, 600, 1000, -1000, -200}, cyclicRotation.solution(a, 4));
        assertEqualsArray(new int[]{-200, 0, 100, 600, 1000, -1000}, cyclicRotation.solution(a, 5));
    }

    @Test
    public void array_size_50() {
        int[] a = makeIntArray(50);
        int[] result = cyclicRotation.solution(a, 1);
        assertEquals(50, result[0]);
        assertEquals(1, result[1]);
        assertEquals(49, result[49]);
    }

    @Test
    public void array_size_100() {
        int[] a = makeIntArray(100);
        int[] result = cyclicRotation.solution(a, 1);
        assertEquals(100, result[0]);
        assertEquals(1, result[1]);
        assertEquals(99, result[99]);
    }

    @Test
    public void array_size_100_2() {
        int[] a = makeIntArray(100);
        int[] result = cyclicRotation.solution(a, 5);
        assertEquals(96, result[0]);
        assertEquals(97, result[1]);
        assertEquals(95, result[99]);
    }

    private int[] makeIntArray(final int n) {
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
        }
        return a;
    }

    private void assertEqualsArray(int[] expected, int[] actual) {
        assertTrue(Arrays.equals(expected, actual));
    }

}