package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
               if (!openBrackets.isEmpty()){
                   areBalanced = false;
                   break;
               }
                char lastOpenBracket = openBrackets.pop();

                if (lastOpenBracket == '(' && currentBracket == ')') {

                } else if (lastOpenBracket == '{' && currentBracket == '}') {

                } else if (lastOpenBracket == '[' && currentBracket == ']') {

                } else {
                    areBalanced = false;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
