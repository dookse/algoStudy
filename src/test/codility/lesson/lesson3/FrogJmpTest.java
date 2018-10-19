package codility.lesson.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    private FrogJmp frogJmp;

    @Before
    public void setUp() {
        frogJmp = new FrogJmp();
    }

    @Test
    public void test_min() {
        int x = 1, y = 1, d = 1;
        assertEquals(0, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_max_value() {
        int x = 1_000_000_000, y = 1_000_000_000, d = 1_000_000_000;
        assertEquals(0, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_max_count() {
        int x = 1, y = 1_000_000_000, d = 1;
        assertEquals(999_999_999, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_1_no_remain() {
        int x = 10, y = 20, d = 10;
        assertEquals(1, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_1_remain() {
        int x = 10, y = 19, d = 10;
        assertEquals(1, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_2_remain() {
        int x = 1, y = 19, d = 10;
        assertEquals(2, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_2_no_remain() {
        int x = 1, y = 21, d = 10;
        assertEquals(2, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_3_remain() {
        int x = 10, y = 85, d = 30;
        assertEquals(3, frogJmp.solution(x, y, d));
    }

    @Test
    public void test_3_no_remain() {
        int x = 10, y = 100, d = 30;
        assertEquals(3, frogJmp.solution(x, y, d));
    }


}