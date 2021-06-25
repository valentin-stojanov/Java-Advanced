package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostFor1km = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, fuelCostFor1km);
            carMap.put(model, car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] tokens = command.split("\\s+");
            String model = tokens[1];
            int kilometersToDrive = Integer.parseInt(tokens[2]);

            if (tokens[0].equals("Drive")){
                if (carMap.get(model).canTravel(kilometersToDrive)) {

                }else {
                    System.out.println("Insufficient fuel for the drive");
                }
            }

            command = scanner.nextLine();
        }

        carMap
                .values()
                .forEach(car -> System.out.println(car.toString()));
    }
}
