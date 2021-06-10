package SetsAndMapsAdvanced;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            chemicalElements.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        }
//        chemicalElements.forEach(e -> System.out.print(e + " "));
        System.out.println(String.join(" ", chemicalElements));
    }
}
