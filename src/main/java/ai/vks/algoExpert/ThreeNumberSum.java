package ai.vks.algoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeNumberSum {
    public static void main(String[] args) {
//        var input = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
//        [-1,0,1,2,-1,-4]
//        var input = new int[]{-2, 0, 0, 2, 2};
        var input = new int[]{-1, 0, 1, 2, -1, -4};
//        var input = new int[]{-2, 0, 3, -1, 4, 0, 3, 4, 1, 1, 1, -3, -5, 4, 0};
        var targetSum = 0;
//        threeSum(input, targetSum).forEach(x -> arrPrint(x));
        threeLCSum(input, targetSum).forEach(ThreeNumberSum::arrPrint);
    }

    private static void arrPrint(List<Integer> input) {
        String s = input.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println("[ " + s + " ]");
    }

    /* Time : O(n2), Space: O(N) */
    private static List<Integer[]> threeSum(int[] input, int targetSum) {
        List<Integer[]> t = new ArrayList<>();
        int[] array = Arrays.stream(input).sorted().toArray();
        for (int i = 0; i < array.length; i++) {
            int CN = array[i];
            int R = input.length - 1;
            int L = i + 1;
            while (L < R) {
                int TS = CN + array[L] + array[R];
                if (TS == targetSum) {
                    t.add(new Integer[]{CN, array[L], array[R]});
                    L += 1;
                    R -= 1;
                } else if (TS < targetSum) {
                    L += 1;
                } else {
                    R -= 1;
                }
            }
        }
        return t;
    }

    /* Time : O(n2), Space: O(N)
     * https://leetcode.com/problems/3sum/description/
     * */

    private static List<List<Integer>> threeLCSum(int[] input, int targetSum) {
        List<List<Integer>> t = new ArrayList<>();
        int[] array = Arrays.stream(input).sorted().toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] == array[i - 1]) {
                continue;
            }
            int CN = array[i];
            int R = array.length - 1;
            int L = i + 1;
            while (L < R) {
                int TS = CN + array[L] + array[R];
                if (TS == targetSum) {
                    t.add(List.of(CN, array[L], array[R]));
                    int ol = array[L];
                    int or = array[R];
                    L += 1;
                    R -= 1;
                    while (array[L] == ol && array[R] == or && L < R) {
                        L += 1;
                        R -= 1;
                    }
                } else if (TS < targetSum) {
                    int tt = array[L];
                    L = L + 1;
                    while (tt == array[L] && L < R) {
                        L = L + 1;
                    }

                } else {
                    int tt = array[R];
                    R = R - 1;
                    while (tt == array[R] && R > L) {
                        R = R - 1;
                    }
                }
            }
        }

        return t;
    }
}
