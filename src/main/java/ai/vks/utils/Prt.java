package ai.vks.utils;

public interface Prt {
    static void array(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
