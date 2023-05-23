package ai.vks.algoExpert;


import java.util.Arrays;

/*O(N log N)*/
public class SortedSquaredArray {
    public static void main(String[] args) {
        var input = new int[]{-6, 2, 3, 5, 6, 8, 9};
        for (int i : sol2(input)) {
            System.out.println(i);
        }

    }

    /**
     * Solution using stream API
     * Complexity : O(nlog(n)) | S(1)
     */
    private static int[] sol1(int[] input) {
        return Arrays.stream(input)
                .map(operand -> operand * operand)
                .sorted()
                .toArray();
    }

    /**
     * Solution using two pointers
     * Complexity : O(nlog(n)) | S(n)
     */
    private static int[] sol2(int[] input) {
        int[] opt = new int[input.length];
        int start = 0;
        int end = input.length - 1;
        int cnt = end;
        while (!(start > end)) {
            if (Math.abs(input[start]) < Math.abs(input[end])) {
                opt[cnt] = (input[end] * input[end]);
                cnt -= 1;
                end -= 1;
            } else if (Math.abs(input[start]) > Math.abs(input[end])) {
                opt[cnt] = input[start] * input[start];
                cnt -= 1;
                start += 1;
            } else {
                opt[cnt] = input[start] * input[start];
                cnt -= 1;
                start += 1;
            }
        }
        return opt;
    }
}
