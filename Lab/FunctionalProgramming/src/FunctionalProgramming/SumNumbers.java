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

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(" ,"))
                .map(parse)
                .toArray(Integer[]::new);


    }
}
