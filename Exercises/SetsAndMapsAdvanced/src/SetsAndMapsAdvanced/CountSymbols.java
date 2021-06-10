package SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> occurrences = new TreeMap<>();

        char[] input = scanner.nextLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            char currentSymbol = input[i];
            occurrences.putIfAbsent(currentSymbol, 0);
            occurrences.put(currentSymbol, occurrences.get(currentSymbol) + 1);
        }

        occurrences.forEach((key, value) -> {
            System.out.printf("%c: %d time/s%n", key, value);
        });
    }
}
