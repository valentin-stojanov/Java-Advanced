package FunctionalProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<String, Function<List<Integer>, List<Integer>>> functions = new HashMap<>();

        functions.put("add", e ->e.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList()));
        functions.put("multiply", e ->e.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList()));
        functions.put("subtract", e ->e.stream()
                .map(x -> x - 1)
                .collect(Collectors.toList()));


        String command = scanner.nextLine();
            while (!command.equals("end")) {

                if (!command.equals("print")) {
                    numbers = functions.get(command).apply(numbers);
                }else {
                    numbers.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                }

                command = scanner.nextLine();
            }
        }
    }
