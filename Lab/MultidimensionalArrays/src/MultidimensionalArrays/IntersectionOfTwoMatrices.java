package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(scanner, rows, columns, " ");
        char[][] secondMatrix = readMatrix(scanner, rows, columns, " ");
        char[][] intersectedMatrix = getIntersectedMatrix(rows, columns, firstMatrix, secondMatrix);

        printMatrix(intersectedMatrix);


    }

    private static void printMatrix(char[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] getIntersectedMatrix(int rows, int columns, char[][] firstMatrix, char[][] secondMatrix){
        char[][] matrix = new char[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    matrix[row][col] = '*';
                }else {
                    matrix[row][col] = firstMatrix[row][col];
                }
            }
        }

        return matrix;
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int columns, String pattern) {
        char[][] matrix = new char[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readCharArray(scanner, pattern);
        }

        return matrix;
    }

    private static char[] readCharArray(Scanner scanner, String pattern) {
        String[] charactersAsString = scanner.nextLine().split(pattern);
        char[] characters = new char[charactersAsString.length];

        for (int i = 0; i < charactersAsString.length; i++) {
            characters[i] = charactersAsString[i].charAt(0);
        }
        return characters;
    }
}