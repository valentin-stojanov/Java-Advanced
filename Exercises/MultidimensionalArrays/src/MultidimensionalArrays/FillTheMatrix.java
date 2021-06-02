package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String patternToFill = input[1];

        int[][] matrix = fillMatrix(size, patternToFill);

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrix(int size, String patternToFill) {
        int[][] matrix = new int[size][size];
        int elementToFill = 1;
        if (patternToFill.equals("A")) {
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = elementToFill;
                    elementToFill++;
                }
            }
        }else if (patternToFill.equals("B")){
            for (int col = 0; col < matrix.length; col++) {
                if (col % 2 == 0){
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = elementToFill;
                        elementToFill++;
                    }
                }else {
                    for (int row = matrix.length-1; row >=0 ; row--) {
                        matrix[row][col] = elementToFill;
                        elementToFill++;
                    }
                }
            }
        }

        return matrix;
    }
}
