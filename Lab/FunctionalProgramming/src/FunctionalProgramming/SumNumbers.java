package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> parse = Integer::parseInt;

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(parse)
                .toArray(Integer[]::new);

        long count = Arrays.stream(numbers)
                .count();
        System.out.println("Count = " + count);

        int sum = Arrays.stream(numbers)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum = " + sum);

    }
}
