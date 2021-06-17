package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> getMin = arr -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        };


        System.out.println(
                getMin.apply(Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray())
        );
    }
}
