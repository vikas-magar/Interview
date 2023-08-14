package ai.vks.ae;

import static org.junit.jupiter.api.Assertions.*;

class BestSeatTest {

    @org.junit.jupiter.api.Test
    void bestSeat1() {
        var input = new int[]{1, 0, 1, 0, 0, 0, 1};
        assertEquals(4, new BestSeat().bestSeat(input));

    }
    @org.junit.jupiter.api.Test
    void bestSeat2() {
        var input = new int[]{1, 1, 1, 0, 1, 1};
        assertEquals(3, new BestSeat().bestSeat(input));

    }
}