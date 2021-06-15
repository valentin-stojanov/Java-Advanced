package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = x -> x * 1.2;
        Consumer<Double> printFormatted =  x -> System.out.printf("%.2f%n", x);

        System.out.println("Prices with VAT:");

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .boxed()
                .map(addVat)
                .forEach(printFormatted);
    }
}
