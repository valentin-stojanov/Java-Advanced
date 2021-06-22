package CarConstructors;

import CarConstructors.Car;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<Car> cars = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 1){
                Car car = new Car(tokens[0]);
                cars.add(car);
            }else{
                Car car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
                cars.add(car);
            }
        }

        cars
                .forEach(System.out::println);
    }
}
