package ai.vks.ae;

import java.util.HashMap;

public class MejorityElement {
    /*Time: O(n) | Space: O(n)*/
    public int majorityElement1(int[] array) {
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
    public int majorityElement(int[] array){
        var majorityE = -1;
        var majorityC = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0){majorityE=array[i]; majorityC = 1;}
            if (majorityC == 0){majorityE=array[i+1]; majorityC = 1;}
            else {
                if (array[i] == majorityE) majorityC += 1;
                else {
                     majorityC -= 1;
                }
            }
        }
        System.out.println(majorityE);
        return majorityE;
    }

    public static void main(String[] args) {
//        var input = new int[] {1, 2, 3, 2, 2, 1, 2};
        var input = new int[] {1, 1, 1, 1, 2, 2, 2, 2, 2};
        new MejorityElement().majorityElement(input);
    }
}
