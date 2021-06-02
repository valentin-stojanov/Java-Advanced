package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = input[0];
        int columns = input[1];

        int[][] matrix = readMatrix(scanner, rows, columns);

        int[][] maxMatrix = getMaxMatrix(matrix);
        int sumOfElements = getSumOfElements(maxMatrix);
        System.out.printf("Sum = %d%n", sumOfElements);
        printMatrix(maxMatrix);
    }

    private static void printMatrix(int[][] maxMatrix) {
        for (int row = 0; row < maxMatrix.length; row++) {
            for (int col = 0; col < maxMatrix[row].length; col++) {
                System.out.print(maxMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int getSumOfElements(int[][] maxMatrix) {
        int sum =0;
        for (int row = 0; row < maxMatrix.length; row++) {
            for (int col = 0; col < maxMatrix[row].length; col++) {
                sum += maxMatrix[row][col];
            }
        }
        return sum;
    }

    private static int[][] getMaxMatrix(int[][] matrix) {
        int[][] maxMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentSum =
                        matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                                + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                                + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        for (int row = 0; row < maxMatrix.length; row++) {
            for (int col = 0; col < maxMatrix[row].length; col++) {
                maxMatrix[row][col] = matrix[maxRow + row][maxCol +col];
            }
        }
        return maxMatrix;
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
