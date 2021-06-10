package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> set = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        while (!resource.equals("stop")){
            set.putIfAbsent(resource, 0);
            set.put(resource, set.get(resource) + quantity);


            resource = scanner.nextLine();
            if (resource.equals("stop")){
                break;
            }
            quantity = Integer.parseInt(scanner.nextLine());
        }

        set.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
