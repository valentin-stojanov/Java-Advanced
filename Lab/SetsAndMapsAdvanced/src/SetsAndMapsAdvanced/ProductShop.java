package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String command = scanner.nextLine();

        while (!command.equals("Revision")){
            String[] tokens = command.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);


            command = scanner.nextLine();
        }

        for (var shop : shops.entrySet()) {
            System.out.println(shop.getKey() + "->");
            shop.getValue().forEach((product, price) -> System.out.printf("Product: %s, Price: %.1f%n", product, price));
        }
    }

}
