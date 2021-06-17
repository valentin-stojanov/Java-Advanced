package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> printer = s -> System.out.println(s);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(printer);

    }
}
