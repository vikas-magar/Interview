package ai.vks.ae;

public class ArrayOfProduct {
    public static void main(String[] args) {
        var input = new int[]{5, 1, 4, 2};
        for (int i : arrayOfProducts(input)) {
            System.out.println(i);
        }
    }

    /* Time: O(n) | Space: O(n)*/
    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        var left = new int[array.length];
        var right = new int[array.length];
        var outPut = new int[array.length];
        int product = 1;

        // LEFT
        for (int j = 0; j < array.length; j++) {
            if (j == 0) left[j] = product;
            else {
                product = product * array[j - 1];
                left[j] = product;
            }
        }

        //RIGHT
        product = 1;
        for (int j = array.length - 1; j >= 0; j--) {
            if (j == array.length - 1) right[j] = product;
            else {
                product = product * array[j + 1];
                right[j] = product;
            }
        }
        // Compute ALL
        for (int j = 0; j < array.length; j++) outPut[j] = left[j] * right[j];

        return outPut;
    }
}
