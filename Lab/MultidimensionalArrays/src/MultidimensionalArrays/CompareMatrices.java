package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input[] = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                matrix[row][col] = scanner.nextInt();
//            }
//        }

    }
}
