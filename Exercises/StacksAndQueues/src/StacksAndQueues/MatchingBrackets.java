package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        ArrayDeque<Integer> startIndexes = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar == '('){
                startIndexes.push(i);
            }else if (currentChar == ')'){
                int startIndex = startIndexes.pop();
                int endIndex = i;
                String substring = expression.substring(startIndex, endIndex + 1);
                System.out.println(substring);
            }
        }
    }
}
