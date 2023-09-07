package ai.vks.ae;

import java.util.HashMap;

public class MejorityElement {
    /*Time: O(n) | Space: O(n)*/
    public int majorityElement(int[] array) {
        HashMap<Integer, Integer> store = new HashMap<>();
        if (array.length < 1) return -1;
        else if (array.length == 1) {
            return array[0];
        }
        var majorityE = 0;
        var majorityK = 0;
        for (int e: array){
            if (store.containsKey(e)){
                int count = store.get(e);
                store.replace(e, count+1);
                if (majorityK < count+1){
                    majorityK = count + 1;
                    majorityE = e;
                }
            }else {
                store.put(e, 1);
            }
        }
        return (majorityK >= array.length / 2) ? majorityE : -1;
    }
}
