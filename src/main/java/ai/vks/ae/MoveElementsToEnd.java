package ai.vks.ae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementsToEnd {
  public static void main(String[] args) {
    List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
    int toMove = 2;
    moveTheElements(array, toMove).forEach(x -> System.out.println(x));
  }

  private static List<Integer> moveTheElements(List<Integer> array, int toMove) {
    int sz = array.size();
    int start = 0;
    int end = sz - 1;
    while (start <= end) {
      if (array.get(start) == toMove) {
        while (array.get(end) == toMove && end > start) end -= 1;
        int t = array.get(start);
        array.set(start, array.get(end));
        array.set(end, t);
      }

      start += 1;
    }
    return array;
  }
}
