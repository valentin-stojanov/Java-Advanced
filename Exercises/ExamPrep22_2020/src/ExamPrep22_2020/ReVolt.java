package ExamPrep22_2020;

import java.util.Scanner;

public class ReVolt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int[] playerPosition = new int[2];

        for (int i = 0; i < size; i++) {
            char[] line = scanner.nextLine().toCharArray();
            matrix[i] = line;
        }

        for (int i = 0; i < matrix.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'f'){
                    playerPosition[0] = i;
                    playerPosition[1] = j;
                    isFound = true;
                    break;
                }
                if (isFound){
                    break;
                }
            }
        }

        boolean isWon = false;
        int playerRow = playerPosition[0];
        int playerCol = playerPosition[1];

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.equals("up")){
                movePlayer(playerRow, playerCol);
            }
        }


        if (isWon){
            System.out.println("Player won!");
        }else{
            System.out.println("Player lost!");
        }

        printMatrix(matrix);
    }

    private static void movePlayer(int playerRow, int playerCol) {
        playerRow -= 1;
        playerCol -= 0;
    }


    private static void printMatrix(char[][] matrix) {
        for (char[] line : matrix) {
            for (char c : line) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
