package codility.lesson.lesson1;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.valueOf;
import static org.junit.Assert.*;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setUp() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void expected_0() {
        int expected = 0;
        testEquals("1", expected);
        testEquals("0", expected);
        testEquals("10", expected);
        testEquals("01", expected);
        testEquals("010", expected);
        testEquals("10000", expected);
        testEquals("10000000000000000000000000", expected);
    }

    @Test
    public void expected_1() {
        int expected = 1;
        testEquals("101", expected);
        testEquals("10101", expected);
        testEquals("00101", expected);
        testEquals("000101", expected);
    }

    @Test
    public void expected_2() {
        int expected = 2;
        testEquals("1001", expected);
        testEquals("110011", expected);
        testEquals("110011110011", expected);
        testEquals("1011011101001011", expected);
        testEquals("1111011101001011001", expected);
    }

    @Test
    public void expected_3() {
        int expected = 3;
        testEquals("10001", expected);
        testEquals("100010", expected);
        testEquals("0100010", expected);
        testEquals("10100010", expected);
        testEquals("100100010", expected);
        testEquals("10111000110", expected);
    }

    @Test
    public void expected_5() {
        testEquals("1000001", 5);
        testEquals("10000010", 5);
        testEquals("010000010", 5);
        testEquals("1000010000010", 5);
        testEquals("1010010000100000100000100010010", 5);
    }
    
    @Test
    public void expected_28() {
        testEquals("1100000000000000000000000000001", 28);
    }


    private void testEquals(final String binary, final int expected) {
        int n = binaryToInt(binary);
        int result = binaryGap.solution(n);
        assertEquals(expected, result);
    }

    private int binaryToInt(final String binary) {
        return valueOf(binary, 2);
    }


}