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

        while (!command.equals("Nuke it from orbit")){
            String[] tokens = command.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[1]);




            command = scanner.nextLine();
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
