package codility.lesson.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.junit.Before;
import org.junit.Test;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.rangeClosed;
import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    private FrogRiverOne frogRiverOne;

    @Before
    public void setUp() {
        frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void x1_array1() {
        int a[] = {1};
        int result = frogRiverOne.solution(1, a);
        assertEquals(0, result);
    }

    @Test
    public void x2_array1() {
        int a[] = {2};
        int result = frogRiverOne.solution(2, a);
        assertEquals(-1, result);
    }

    @Test
    public void x2_array2() {
        int a[] = {1, 2};
        int result = frogRiverOne.solution(2, a);
        assertEquals(1, result);
    }

    @Test
    public void x2_array2_false() {
        int a[] = {2, 2};
        int result = frogRiverOne.solution(2, a);
        assertEquals(-1, result);
    }

    @Test
    public void x2500_array2500() {
        int x = 2500;
        int[] a = getShuffleArraysOf(x);
        int result = frogRiverOne.solution(x, a);
        assertEquals(2499, result);
    }

    @Test
    public void x50_000_array50_000() {
        int x = 50_000;
        int[] a = getShuffleArraysOf(x);
        int result = frogRiverOne.solution(x, a);
        assertEquals(49_999, result);
    }

    @Test
    public void x100_000_array1000_000() {
        int x = 100_000;
        int[] a = getShuffleArraysOf(x);
        int result = frogRiverOne.solution(x, a);
        assertEquals(99_999, result);
    }

    private int[] getShuffleArraysOf(final int length) {
        int[] array = rangeClosed(1, length).toArray();
        List<Integer> list = getListFrom(array);
        Collections.shuffle(list);
        return getIntArrayFrom(list);
    }

    private List<Integer> getListFrom(final int[] intArray) {
        return of(intArray)
            .boxed()
            .collect(toCollection(ArrayList::new));
    }

    private int[] getIntArrayFrom(final List<Integer> list) {
        return list.stream()
            .filter(Objects::nonNull)
            .mapToInt(i -> i)
            .toArray();
    }
}