package ai.vks.ae;

import java.util.HashMap;

public class FirstDuplicateValue {
    public static void main(String[] args) {
        var input = new int[]{2, 1, 5, 2, 3, 3, 4};
        System.out.println(firstDuplicateValue(input));
    }

    /*Time : O(n) | Space: O(n)*/
    public static int firstDuplicateValue(int[] array) {
        /*Hash Map Get/Put O(1) | Space O(n)*/
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        /*
        Check each element present in map if yes then that's first duplicate.
        if not put it in hashmap.
        * */
        for (int i : array) {
            if (hashMap.get(i) != null) {
                return i;
            } else {
                hashMap.put(i, i);
            }
        }
        return -1;
    }
}
