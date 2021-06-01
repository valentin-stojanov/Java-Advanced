package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readArray(scanner, ", ");
        int rows = input[0];
        int columns = input[1];

        int[][] matrix = readMatrix(scanner, rows, columns, ", ");
        int sumOfElements = getSumOfElement(matrix);
        System.out.printf("%d%n%d%n%d", rows, columns, sumOfElements);

    }

    private static int getSumOfElement(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum+=matrix[row][col];
            }
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int columns, String pattern) {
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readArray(scanner, pattern);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
