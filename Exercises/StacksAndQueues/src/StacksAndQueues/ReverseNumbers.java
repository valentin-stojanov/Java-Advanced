package StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsString = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (String str : numbersAsString) {
            numbers.push(Integer.parseInt(str));
        }

        for (Integer number : numbers) {
            System.out.print(numbers.pop() + " ");
        }
    }
}
