package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArray(scanner.nextLine());
        int rows = input[0];
        int cols = input[1];

        int[][] firstMatrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            firstMatrix[row] = readArray(scanner.nextLine());
        }


        //Read matrix
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                matrix[row][col] = scanner.nextInt();
//            }
//        }
//        scanner.nextLine();

        // Print matrix
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
    public static void printMatrix(int[][] matrix){
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static int[] readArray(String line){
        return Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
