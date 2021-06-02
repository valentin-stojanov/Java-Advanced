package MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] matrix = getMatrix(size, scanner);
        int sumOfPrimaryDiagonal = getSumOfPrimaryDiagonal(matrix);
        int sumOfSecondaryDiagonal = getSumOfSecondaryDiagonal(matrix);
        System.out.println(Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal));
    }

    private static int getSumOfSecondaryDiagonal(int[][] matrix) {
        int sum =0;
        for (int i = matrix.length-1, j = 0 ; i >= 0; i--, j++) {
            sum += matrix[i][j];
        }

        return sum;
    }

    private static int getSumOfPrimaryDiagonal(int[][] matrix) {
        int sum =0;
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            sum+=matrix[i][j];
        }
        return sum;
    }

    private static int[][] getMatrix(int size, Scanner scanner) {
        int[][] matrix= new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
