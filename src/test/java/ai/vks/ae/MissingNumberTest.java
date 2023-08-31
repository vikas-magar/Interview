package ai.vks.ae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @Test
    void find1() {
        var input = new int[]{4, 5, 1, 3};
        var expected = new int[]{2, 6};
        int[] opts = new MissingNumber().find(input);
        assertEquals(opts.length, expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], opts[i]);
        }
    }

    @Test
    void find2() {
        var input = new int[]{};
        var expected = new int[]{1, 2};
        int[] opts = new MissingNumber().find(input);
        assertEquals(opts.length, expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], opts[i]);
        }
    }
}