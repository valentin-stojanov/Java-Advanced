package OpinionPoll;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> people = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people
                .stream()
                .filter(p -> p.getAge() > 30)
                .sorted((f,s) -> f.getName().compareTo(s.getName()))
                .forEach(p-> System.out.println(p.toString()));

    }
}