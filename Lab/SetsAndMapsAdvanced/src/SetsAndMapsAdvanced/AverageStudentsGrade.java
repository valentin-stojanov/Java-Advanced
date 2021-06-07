package SetsAndMapsAdvanced;

import com.sun.source.tree.Tree;

import java.text.DecimalFormat;
import java.util.*;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, List<Double>> studentsAverageGrade = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String studentName = tokens[0];
            double studentGrade = Double.parseDouble(tokens[1]);
            studentsAverageGrade.putIfAbsent(studentName, new ArrayList<>());
            studentsAverageGrade.get(studentName).add(studentGrade);
        }
        studentsAverageGrade.entrySet().forEach(e->{
            double average = 0.0;
            for (int i = 0; i < e.getValue().size(); i++) {
                average += e.getValue().get(i);
            }
            average /= e.getValue().size();
            System.out.printf("%s -> %s(avg: %.2f)%n", e.getKey(), listToString(e.getValue()) ,average );
        });

    }

    private static String listToString(List<Double> values) {
        StringBuilder list = new StringBuilder();
        DecimalFormat format = new DecimalFormat(".00");
        for (var value : values) {
            list.append(format.format(value)).append(" ");
        }
        return list.toString();
    }
}
