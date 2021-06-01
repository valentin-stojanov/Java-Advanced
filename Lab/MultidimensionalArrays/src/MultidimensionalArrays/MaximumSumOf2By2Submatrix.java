package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2By2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readArray(scanner, ", ");
        int rows = input[0];
        int columns = input[1];

        int[][] matrix = readMatrix(scanner, rows, columns, ", ");

        int maxSum = Integer.MIN_VALUE;
        int rowCoordinate = 0;
        int columnCoordinate = 0;


        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSubmatrixSum = getSumOfElement(new int[][]
                        {
                                {matrix[row][col], matrix[row][col + 1]},
                                {matrix[row + 1][col], matrix[row + 1][col + 1]}
                        }
                );
                if (currentSubmatrixSum > maxSum) {
                    maxSum = currentSubmatrixSum;
                    rowCoordinate = row;
                    columnCoordinate = col;
                }
            }
        }

        System.out.printf("%d %d%n%d %d%n",
                matrix[rowCoordinate][columnCoordinate], matrix[rowCoordinate][columnCoordinate + 1],
                matrix[rowCoordinate + 1][columnCoordinate], matrix[rowCoordinate + 1][columnCoordinate + 1]);
        System.out.println(maxSum);
    }

    private static int getSumOfElement(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
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
