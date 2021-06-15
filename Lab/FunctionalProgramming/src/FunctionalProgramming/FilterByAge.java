package FunctionalProgramming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            people.put(name, age);
        }

        String conditionStr = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Map.Entry<String, Integer>> ageFilter = getAgeFilter(age, conditionStr);
        Consumer<Map.Entry<String, Integer>> formatFilter = getFormatter(format);

        people.entrySet()
                .stream()
                .filter(getAgeFilter(age, conditionStr))
                .forEach(getFormatter(format));
//                .filter(ageFilter)
//                .forEach(formatFilter);


    }

    private static Consumer<Map.Entry<String, Integer>> getFormatter(String format) {

        if (format.equals("name")){
            return entry -> System.out.println(entry.getKey());
        }else if (format.equals("age")){
            return entry -> System.out.println(entry.getValue());
        }
        return entry -> System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    public static Predicate<Map.Entry<String, Integer>> getAgeFilter
            (int age, String conditionStr) {
        if (conditionStr.equals("older")) {
            return entry -> entry.getValue() >= age;
        }
        return entry -> entry.getValue() <= age;
    }
}
