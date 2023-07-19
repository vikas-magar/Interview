package ai.vks.ae;

import java.util.*;

public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        moveElementToEnd(array, toMove).forEach(System.out::println);
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int ptr1 = 0;
        int ptr2 = array.size() - 1;
        while (ptr1 <= ptr2) {
            if (array.get(ptr1) == toMove) {
                while (array.get(ptr2) == toMove) ptr2 -= 1;
                int t = array.get(ptr2);
                array.set(ptr2, array.get(ptr1));
                array.set(ptr1, t);
            }
            ptr1 += 1;
        }
        return array;
    }
}
