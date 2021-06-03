package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, columns);

        String command = scanner.nextLine();

        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            if (isInMatrix(row, col, matrix)) {
                for (int i = Math.max(0, col - radius); i < Math.min(matrix.get(row).size(), col + radius); i++) {
                    matrix.get(row).set(i, -1);
                }
                for (int j = Math.max(0, row - radius); j < Math.min(matrix.size(), row + radius); j++) {
                    if (col < matrix.get(j).size()) {
                        matrix.get(j).set(col, -1);
                    }
                }

                for (int i = 0; i < matrix.size(); i++) {
                    matrix.get(i).removeIf(e -> e < 0);
                }
                matrix.removeIf(list -> list.isEmpty());

            }


            command = scanner.nextLine();
        }
        printMatrix(matrix);
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return (0 <= row && row < matrix.size()) && (0 <= col && col < matrix.get(row).size());
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> list : matrix) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int element = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(element);
                element++;
            }
        }
    }
}
