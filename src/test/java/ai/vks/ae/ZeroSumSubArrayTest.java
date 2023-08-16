package ai.vks.ae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroSumSubArrayTest {

    @Test
    void zeroSumSubarray1() {
        var input = new int[] {4, 2, -1, -1, 3};
        var expected = true;
        var actual = new ZeroSumSubArray().zeroSumSubarray(input);
        assertEquals(expected, actual);
    }

    @Test
    void zeroSumSubarray2() {
        var input = new int[] {};
        var expected = false;
        var actual = new ZeroSumSubArray().zeroSumSubarray(input);
        assertEquals(expected, actual);
    }

    @Test
    void zeroSumSubarray3() {
        var input = new int[] {0};
        var expected = true;
        var actual = new ZeroSumSubArray().zeroSumSubarray(input);
        assertEquals(expected, actual);
    }

    @Test
    void zeroSumSubarray4() {
        var input = new int[] {1};
        var expected = false;
        var actual = new ZeroSumSubArray().zeroSumSubarray(input);
        assertEquals(expected, actual);
    }

    @Test
    void zeroSumSubarray5() {
        var input = new int[] {1, -1};
        var expected = true;
        var actual = new ZeroSumSubArray().zeroSumSubarray(input);
        assertEquals(expected, actual);
    }
}