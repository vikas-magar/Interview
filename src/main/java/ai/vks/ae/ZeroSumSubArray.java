package ai.vks.ae;

import java.util.HashSet;

public class ZeroSumSubArray {
    /*Time: O(n) | Space : O(n)*/
    public boolean zeroSumSubarray(int[] nums) {
        // Write your code here.
        var store = new HashSet<Integer>();
        var sum = 0;
        if (nums.length == 1 && nums[0] == 0) return true;
        if (nums.length == 2) {
            var iSum = 0;
            for (int num : nums) {
                sum += num;
            }
            return iSum == sum;
        } else {
            for (int num : nums) {
                sum += num;
                if (store.contains(sum)) {
                    return true;
                } else {
                    store.add(sum);
                }
            }
        }
        return false;
    }
}

