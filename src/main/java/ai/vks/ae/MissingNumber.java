package ai.vks.ae;

import java.util.Arrays;

public class MissingNumber {
    public int[] find(int[] nums) {
        int average = 0;
        if (Arrays.stream(nums).average().isPresent()) {
            average = (int) Math.ceil(Arrays.stream(nums).average().getAsDouble());
        }
        int lSum = 0;
        int rSum = 0;
        for (int x : nums) {
            if (x < average) {
                lSum += x;
            } else rSum += x;
        }
        return new int[]{((getSum(nums.length + 2) - getSum(average)) - rSum), getSum(average) - lSum};
    }

    private int getSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        var input = new int[]{};
        System.out.println(new MissingNumber().find(input)[0] + " " + new MissingNumber().find(input)[1]);
    }
}
