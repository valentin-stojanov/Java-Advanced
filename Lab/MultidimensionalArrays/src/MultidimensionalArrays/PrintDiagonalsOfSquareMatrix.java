package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(n, scanner, " ");

        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            if (i < matrix.length - 1) {
                System.out.print(matrix[i][j] + " ");
            } else {
                System.out.println(matrix[i][j]);
            }
        }

        for (int i = matrix.length-1, j = 0; i >= 0; i--, j++) {
            if (i > 0) {
                System.out.print(matrix[i][j] + " ");
            } else {
                System.out.println(matrix[i][j]);
            }
        }

    }

    private static int[][] readMatrix(int n, Scanner scanner, String pattern) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(pattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
