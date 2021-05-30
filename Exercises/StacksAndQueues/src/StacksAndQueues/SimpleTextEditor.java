package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("");


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            switch (input[0]){
                case "1":
                    String strToAppend= stack.peek() + input[1];
                    stack.push(strToAppend);
                    break;
                case "2":
                    int numberOfElementToErase = Integer.parseInt(input[1]);
                    String newStr = getNewStr(stack.peek(), numberOfElementToErase);
                    stack.push(newStr);
                    break;
                case "3":
                    String element = stack.peek();
                    int elementAtPosition = Integer.parseInt(input[1])-1;
                    if (!element.equals("") && (elementAtPosition < element.length())) {
                        char charToPrint = element.charAt(elementAtPosition);
                        System.out.println(charToPrint);
                    }
                    break;
                case "4":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
            }

        }
    }

    private static String getNewStr(String peek, int numberOfElementToErase) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < peek.length() - numberOfElementToErase; i++) {
            str.append(peek.charAt(i));
        }
        return str.toString();
    }
}
