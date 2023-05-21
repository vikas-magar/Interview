package ai.vks;

import java.util.*;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] strArray = { "Alex", "Charles", "Dean","Dqan", "Amanda", "Brian" };
        System.out.println(reverseString(strArray));
    }

    private static List<String> reverseString(String[] inputList) {
        return Stream.of(inputList).sorted(Comparator.reverseOrder()).toList();
    }
}
