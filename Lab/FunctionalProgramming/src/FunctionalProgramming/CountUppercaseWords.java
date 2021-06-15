package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isCapital = str -> Character.isUpperCase(str.charAt(0));

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isCapital)
                .collect(Collectors.toList());
         System.out.println(words.size());

        System.out.println(String.join(System.lineSeparator(), words));
    }
}
