package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortEvenNumbersList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntPredicate isEven = e -> e % 2 == 0;

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(isEven)
                .boxed()
                .collect(Collectors.toList());

        String collectedNumbers = numbers
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(collectedNumbers);

        String sortedNumbers = numbers
                .stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);

    }
}
