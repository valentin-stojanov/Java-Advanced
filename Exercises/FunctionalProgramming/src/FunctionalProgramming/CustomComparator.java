package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comparator<Integer> sort = (f, s) -> {
            int result =Integer.compare(Math.abs(f % 2), Math.abs(s%2));
            if (result == 0){
                result = f - s;
            }
            return result;
        };

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(sort)
                .map(e -> e + " ")
                .forEach(System.out::print);
    }
}
