package ai.vks.ae;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FourNumberSum {
    public static List<Integer[]> fourNumberSum(int[] array, int target) {
        if (array.length < 4) new ArrayList<>();
        HashMap<Integer, ArrayList<Integer[]>> store = new HashMap<>();
        ArrayList<Integer[]> output = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sm = array[i] + array[j];
                int diff = target - sm;
                if (store.containsKey(diff)) {
                    ArrayList<Integer[]> ints = store.get(diff);
                    for (Integer[] anInt : ints) {
                        output.add(new Integer[]{anInt[0], anInt[1], array[i], array[j]});
                    }
                }
            }
            for (int j = 0; j < i + 1; j++) {
                if (array[i] == array[j]) continue;
                int sm = array[i] + array[j];
                ArrayList<Integer[]> integers;
                if (store.containsKey(sm)) {
                    integers = store.get(sm);
                } else {
                    integers = new ArrayList<>();
                }
                integers.add(new Integer[]{array[i], array[j]});
                store.put(sm, integers);
            }
        }
        return output;
    }

}
