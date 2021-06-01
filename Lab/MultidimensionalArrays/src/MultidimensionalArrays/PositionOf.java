package MultidimensionalArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArray(scanner.nextLine(), " ");

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = readMatrix(rows, cols, scanner, " ");

        int searchNumber = scanner.nextInt();

        List<int[]> occurrences = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (searchNumber == matrix[row][col]){
                    occurrences.add(new int[]{row, col});
                }
            }
        }
        if (!occurrences.isEmpty()){
            for (int i = 0; i < occurrences.size(); i++) {
                System.out.println(occurrences.get(i)[0] + " " + occurrences.get(i)[1]);
            }
        }else {
            System.out.println("not found");
        }


    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner, String pattern) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readArray(scanner.nextLine(),pattern);
        }
        return matrix;
    }

    private static int[] readArray(String line, String pattern) {
        return  Arrays.stream(line.split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
