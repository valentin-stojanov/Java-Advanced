package SetsAndMapsAdvanced;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> nameAndScore = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = readDoubleArray(scanner);
//            double averageScore = Arrays.stream(grades).average().orElse(0);
            nameAndScore.put(name, grades);
        }
        for (Map.Entry<String, double[]> studentEntry : nameAndScore.entrySet()) {
            System.out.println(studentEntry.getKey()+" is graduated with "+  Arrays.stream(studentEntry.getValue()).average().orElse(0));
        }
    }

    private static double[] readDoubleArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
