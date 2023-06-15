package ai.vks.ae;

import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        var input = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        var sub = List.of(5, 1, 22, 23, 6, -1, 8, 10);
        System.out.println(validateSubsequence(input, sub));
    }

    /**
     * Validate the subsequence of an array.
     * Complexity : O(N) | S(1)
     */
    private static boolean validateSubsequence(List<Integer> input, List<Integer> sub) {
        int position = 0;
        for (int ele : input) {
            if (position == sub.size()) return true;
            if (sub.get(position) == ele) {
                position += 1;
            }
        }
        return position == sub.size();
    }
}
