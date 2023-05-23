package ai.vks.algoExpert;

import java.util.Arrays;

public class NonConstructableChange {
    public static void main(String[] args) {
        int[] input = new int[]{5, 7, 1, 1, 2, 3, 22};
        System.out.println(nonChange(input));
    }

    /**
     * Find the Minimum change which can not be formed using input coins
     * Sol: O(nlog(n))
     * */
    static int nonChange(int[] input) {
        int[] array = Arrays.stream(input).sorted().toArray();
        int currentChange = 0;
        for (int i : array) {
            if (i <= currentChange + 1) {
                currentChange += i;
            } else {
                return currentChange + 1;
            }
        }
        return currentChange + 1;
    }
}
