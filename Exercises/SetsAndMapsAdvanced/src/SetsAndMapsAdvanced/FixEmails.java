package SetsAndMapsAdvanced;

import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> contacts = new LinkedHashMap<>();

        while (true){
            String name = scanner.nextLine();
            if (name.equals("stop")){
                break;
            }
            String email = scanner.nextLine().toLowerCase(Locale.ROOT);

            contacts.putIfAbsent(name, new ArrayList<String>());
            contacts.get(name).add(email);
        }

        contacts.forEach((name, list) -> {
            list.removeIf(e -> e.contains(".us") || e.contains(".uk") || e.contains(".com"));
            if (!list.isEmpty()){
                System.out.printf("%s -> %s%n", name, String.join(" ",list));
            }
        });

    }
}
