package ai.vks.ae;

import ai.vks.utils.Prt;

public class BestSeat {
    /*Time: O(n) | Space: O(1)*/
    public int bestSeat(int[] seats) {
        Prt.array(seats);
        int bestSeat = -1;
        int maxSpace = 0;
        int left = 0;
        int right = 1;
        while (right < seats.length) {
            while (seats[right] != 1) right += 1;
            int tms = right - left - 1;
            if (tms > maxSpace) {
                maxSpace = tms;
                bestSeat = (right + left) / 2;
            }
            left = right;
            right += 1;
        }
        return bestSeat;
    }

}

