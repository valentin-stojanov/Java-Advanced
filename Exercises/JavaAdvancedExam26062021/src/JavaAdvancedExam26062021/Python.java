package JavaAdvancedExam26062021;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        char[][] matrix = new char[size][size];

        int[] position = new int[2];
//        int sRow = position[0];
//        int sCol = position[1];
        int foodQuantity = 0;

        for (int i = 0; i < size; i++) {
            String str = scanner.nextLine();
            String[] lineStr = str.split("\\s+");
            char[] line = new char[size];
            for (int j = 0; j < size; j++) {
                line[j] = lineStr[j].charAt(0);
                if (line[j] == 's') {
                    position[0] = i;
                    position[1] = j;
                } else if (line[j] == 'f') {
                    foodQuantity++;
                }
            }
            matrix[i] = line;
        }

        int length = 1;
        boolean isWon = false;
        boolean isEaten = false;

        for (int i = 0; i < commands.length; i++) {
            String movement = commands[i];

            int []newPosition = move(size, position[0], position[1], movement);
            position = newPosition;
            int row = position[0];
            int cow = position[1];

            if (matrix[row][cow] == 'f'){
                foodQuantity--;
                length++;
                if (foodQuantity == 0){
                    isWon =true;
                    break;
                }
            }else if (matrix[row][cow] == 'e'){
                isEaten = true;
                break;
            }

//            System.out.println();

        }

        if (isWon){
            System.out.printf("You win! Final python length is %d", length);
        }
        if (isEaten){
            System.out.printf("You lose! Killed by an enemy!");
        }

        if (!isEaten && !isWon){
            System.out.printf("You lose! There is still %d food to be eaten.", foodQuantity);
        }


    }

    private static int[] move(int size, int sRow, int sCol, String movement) {
        int[] newPosition = new int[2];
        int newRow = sRow;
        int newCol = sCol;

        switch (movement) {
            case "up":
                newRow = sRow - 1;
                if (newRow < 0) {
                    newRow = size - 1;
                }
                break;
            case "down":
                newRow = sRow + 1;
                if (newRow > size - 1) {
                    newRow = 0;
                }
                break;
            case "left":
                newCol = sCol - 1;
                if (newCol < 0) {
                    newCol = size - 1;
                }
                break;
            case "right":
                newCol = sCol + 1;
                if (newCol > size - 1) {
                    newCol = 0;
                }
                break;
        }
        newPosition[0] = newRow;
        newPosition[1] = newCol;

        return newPosition;
    }


    private static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char symbol : arr) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}