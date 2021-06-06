package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {

            String carNumber = input.split(", ")[1];

            if (input.contains("IN")) {
                parkingLot.add(carNumber);
            } else {
                parkingLot.remove(carNumber);
            }

            input = scanner.nextLine();
        }

        if (!parkingLot.isEmpty()) {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }

    }
}
