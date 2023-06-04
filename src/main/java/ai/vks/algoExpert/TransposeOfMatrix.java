package ai.vks.algoExpert;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : transposeMatrix(input)) {
            for (int anInt : ints) {

                System.out.print(anInt);
            }
        }
    }

    /*Transpose of matrix
     * Time : O(w*h)
     * Space : O(w*h)
     * */
    public static int[][] transposeMatrix(int[][] matrix) {
        // Write your code here.
        var x = matrix.length;
        var y = matrix[0].length;
        int[][] output = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                output[i][j] = matrix[j][i];
            }
        }
        return output;
    }
}
