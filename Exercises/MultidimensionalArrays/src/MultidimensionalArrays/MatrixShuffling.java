package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readArray(scanner);
        int rows = input[0];
        int columns = input[1];

        String[][] matrix = readMatrix(scanner, rows, columns);
        String[] commandsArray = scanner.nextLine().split("\\s+");

        while (!commandsArray[0].equals("END")) {
            if (!isValid(commandsArray, rows, columns)) {
                System.out.println("Invalid input!");
            } else {
                int firstRow = Integer.parseInt(commandsArray[1]);
                int firstCol = Integer.parseInt(commandsArray[2]);
                int secondRow = Integer.parseInt(commandsArray[3]);
                int secondCol = Integer.parseInt(commandsArray[4]);

                String oldElement = matrix[firstRow][firstCol];
                matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                matrix[secondRow][secondCol] = oldElement;
                printMatrix(matrix);
            }
            commandsArray = scanner.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(String.join(" ", matrix[row]));
        }
    }

    private static boolean isValid(String[] commandsArray, int rows, int columns) {
        if (commandsArray.length != 5) {
            return false;
        }
        if (!commandsArray[0].equals("swap")) {
            return false;
        }
        int firstRow = Integer.parseInt(commandsArray[1]);
        int firstCol = Integer.parseInt(commandsArray[2]);
        int secondRow = Integer.parseInt(commandsArray[3]);
        int secondCol = Integer.parseInt(commandsArray[4]);
        if (!(0 <= firstRow && firstRow < rows) && !(0 <= secondRow && secondRow < rows) &&
            !(0 <= firstCol && firstCol < columns) && !(0 <= secondCol && secondCol < columns)) {
            return false;
        }
        return true;
    }

    private static String[][] readMatrix(Scanner scanner, int rows, int columns) {
        String[][] matrix = new String[rows][columns];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
