package ai.vks.ae;

import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        var a1 = new int[]{-1, 5, 10, 20, 28, 3};
        var a2 = new int[]{26, 134, 135, 15, 17};
        for (int i : smallestDifference(a1, a2)) System.out.println(i);
    }

    /*
    Find The Smallest difference between two numbers from two arrays
    * Time : O(nLog(n)) | Space O(1)
    *
     */
    private static int[] smallestDifference(int[] a, int[] b) {
        int[] arrayOne = Arrays.stream(a).sorted().toArray();
        int[] arrayTwo = Arrays.stream(b).sorted().toArray();
        int minDiff = Integer.MAX_VALUE;
        int currentDifference;
        int num1;
        int num2;
        int[] smallestPair = new int[2];
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr2 < arrayTwo.length && ptr1 < arrayOne.length) {
            num1 = arrayOne[ptr1];
            num2 = arrayTwo[ptr2];
            currentDifference = Math.abs(num1 - num2);
            if (num1 < num2) {
                ptr1 += 1;
            } else if (num2 < num1) {
                ptr2 += 1;
            } else {
                return new int[]{num1, num2};
            }
            if (minDiff > currentDifference) {
                minDiff = currentDifference;
                smallestPair[0] = num1;
                smallestPair[1] = num2;
            }
        }
        return smallestPair;
    }
}
