package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int columns = input[1];

        String[][] palindromeMatrix = generatePalindromeMatrix(rows, columns);
        printMatrix(palindromeMatrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] generatePalindromeMatrix(int rows, int columns) {
        String[][] matrix = new String[rows][columns];
        char startLetter = 'a';

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String currentElement = "" + (char) (startLetter + row) + (char) (startLetter + row + col) + (char) (startLetter + row);
                matrix[row][col] = currentElement;
            }
        }
        return matrix;
    }
}
