package SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> firstSet = readSet(scanner, n);
        Set<Integer> secondSet = readSet(scanner, m);

        firstSet.retainAll(secondSet);

        String intersection = firstSet.stream()
                .map(e -> e + "")
                .collect(Collectors.joining(" "));

        System.out.println(intersection);
    }

    private static Set<Integer> readSet(Scanner scanner, int count) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(scanner.nextInt());
        }
        return set;
    }
}
