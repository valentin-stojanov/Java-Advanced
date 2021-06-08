package SetsAndMapsAdvanced;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country, new ArrayList<>());
            continents.get(continent).get(country).add(city);
        }

        for (var continentEntry : continents.entrySet()) {
            String continent = continentEntry.getKey();
            Map<String, List<String>> countryEntry = continentEntry.getValue();
            System.out.println(continent + ":");
            for (var entry : countryEntry.entrySet()) {
                String countryCities = String.join(", ", entry.getValue());
                System.out.printf("  %s -> %s%n", entry.getKey(), countryCities);
            }

        }
    }


}
