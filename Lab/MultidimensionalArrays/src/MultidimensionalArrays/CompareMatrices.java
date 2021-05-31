package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArray(scanner.nextLine());
        int rows = input[0];
        int cols = input[1];
        int[][] firstMatrix = readMatrix(rows, cols, scanner);

        input = readArray(scanner.nextLine());
        rows = input[0];
        cols = input[1];
        int[][] secondMatrix = readMatrix(rows,cols, scanner);

        if (matricesAreEqual(firstMatrix, secondMatrix)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
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

    private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArray = firstMatrix[row];
            int[] secondArray = secondMatrix[row];
            if (firstArray.length != secondArray.length){
                return false;
            }

            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] != secondArray[col]){
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine());
        }
        return matrix;
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
