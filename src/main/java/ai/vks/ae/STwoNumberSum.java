package ai.vks.ae;

import java.util.Arrays;
import java.util.HashMap;

public class STwoNumberSum {
    public static void main(String[] args) {
        int[] array = {10, 1, 23, 40, -2, 30};
        int targetSum = 38;
        printArray(twoTargetSum(targetSum, array));

    }

    /*Utility function to print the array*/
    private static void printArray(int[] array) {
        System.out.print("[");
        Arrays.stream(array).forEach((e) -> System.out.print(e + ", "));
        System.out.println("]");
    }
/**      Find two numbers from array which will sum up to target number.
*       int[] array = {10, 1, 23, 40, -2, 30};
*       int targetSum = 38;
* */
    private static int[] twoTargetSum(int targetSum, int[] array) {
        HashMap<Integer, Boolean> store = new HashMap<>();
        for (int i : array) {
            var sumPre = targetSum - i;
            if (store.containsKey(sumPre)) {
                return new int[]{sumPre, i};
            } else {
                store.put(i, Boolean.TRUE);
            }
        }
        return new int[]{};
    }

}
