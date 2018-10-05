package codility.lesson.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray odd;

    @Before
    public void setUp() {
        odd = new OddOccurrencesInArray();
    }

    @Test
    public void array_1() {
        int[] a = {9};
        assertEquals(9, odd.solution(a));
    }

    @Test
    public void array_3() {
        int[] a = {50, 13, 50};
        assertEquals(13, odd.solution(a));
    }

    @Test
    public void array_5() {
        int[] a = {1000, 1000, 20000, 20000, 3900};
        assertEquals(3900, odd.solution(a));
    }

    @Test
    public void array_7() {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        assertEquals(7, odd.solution(a));
    }

    @Test
    public void array_11() {
        int[] a = {1, 3, 8, 5, 7, 9, 9, 7, 3, 5, 1};
        assertEquals(8, odd.solution(a));
    }

    @Test
    public void array_50() {
        int expected = 11;
        assertEquals(expected, odd.solution(getRandomOddArray(50, expected)));
    }

    @Test
    public void array_2000_random() {
        int expected = 3321;
        assertEquals(expected, odd.solution(getRandomOddArray(2000, expected)));
    }

    @Test
    public void array_100_000_random() {
        int expected = 23232;
        assertEquals(expected, odd.solution(getRandomOddArray(100_000, expected)));
    }

    @Test
    public void array_999_999_random() {
        int expected = 523121;
        assertEquals(expected, odd.solution(getRandomOddArray(999_999, expected)));
    }

    @Test
    public void array_1_000_000_random() {
        int expected = 1_000_000_000;
        assertEquals(expected, odd.solution(getRandomOddArray(1_000_000, expected)));
    }

    private int[] getRandomOddArray(final int size, final int unique) {
        Random random = new Random();

        Integer[] array = new Integer[size];
        Arrays.setAll(array, i -> random.nextInt(size));

        List<Integer> list = new ArrayList<>(asList(array));
        list.addAll(asList(array));
        list.add(unique);

        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}