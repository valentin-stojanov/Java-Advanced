package FunctionalProgramming;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = s-> System.out.println(s);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> "Sir " + e)
                .forEach(printer);
    }
}
