package ai.vks.ae;

import java.util.HashMap;

/** LongestPeak */
public class LongestPeak {

    public static void main(String[] args) {
        var input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        longestPeak(input);
    }

    public static int longestPeak(int[] array) {
        // Write your code here.
        var max = 0;

        var mp = new HashMap<Integer, Integer>();
        var start = 0;
        var end = array.length - 1;

        if (end + 1 < 3) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (i != start & i != end) {
                if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                    mp.put(i, array[i]);
                }
            }
        }


        mp.forEach(
                (k, v) -> {
                    var kk = 0;
                    var cnt = 0;
                    var left = k -1;
                    var right = v;
                    left = array[left];
                });

        return -1;
    }
}

//for (k, v) in store.iter() {
//        let mut kk;
//        let mut cnt = 1;
//        let mut left = 0;
//        let mut right = 0;
//        //down
//        kk = *k - 1;
//        left = a[kk];
//        right = **v;
//        while kk >= start && left < right {
//        cnt += 1;
//        if kk == 0 {
//        break;
//        }
//        kk = kk - 1;
//        right = left;
//        left = a[kk];
//        }
//        // up
//        kk = *k + 1;
//        left = a[kk];
//        right = **v;
//
//        while left < right && kk <= end {
//        cnt += 1;
//        kk = kk + 1;
//        if(kk > end){break;}
//        right = left;
//        left = a[kk];
//        }
//        if cnt > max {
//        max = cnt;
//        }
//        }