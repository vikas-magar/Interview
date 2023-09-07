package ai.vks.ae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MejorityElementTest {

    @Test
    void majorityElement1() {
        var input = new int[] {1, 2, 3, 2, 2, 1, 2};
        var expected = 2;
        int output = new MejorityElement().majorityElement(input);
        assertEquals(expected, output);
    }

    @Test
    void majorityElement2() {
        var input = new int[] {3,3,1};
        var expected = 3;
        int output = new MejorityElement().majorityElement(input);
        assertEquals(expected, output);
    }
}