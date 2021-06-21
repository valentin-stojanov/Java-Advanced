package CarInfo;

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
            String brand = tokens[0];
            String model = tokens[1];
            int horsepower = Integer.parseInt(tokens[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsepower(horsepower);
            cars.add(car);
        }

        cars
                .forEach(System.out::println);
    }
}
