package CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String departmentName = tokens[3];

            Department department = new Department();
            departmentMap.putIfAbsent(departmentName, department);

            Employee employee = new Employee(name, salary, position);

            if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee.setEmail(email);
                employee.setAge(age);
            } else if (tokens.length == 5) {
                if (Character.isDigit(tokens[4].charAt(0))) {
                    int age = Integer.parseInt(tokens[4]);
                    employee.setAge(age);
                } else {
                    String email = tokens[4];
                    employee.setEmail(email);
                }
            }
            departmentMap.get(departmentName).addEmployee(employee);
        }

        Stream<Map.Entry<String, Department>> entryStream = departmentMap
                .entrySet()
                .stream()
                .sorted((f, s) -> Double.compare(s.getValue().averageSalary(), f.getValue().averageSalary()))
                .limit(1);

        entryStream.forEach((departmentEntry) -> {
            System.out.println(String.format("Highest Average Salary: %s", departmentEntry.getKey()));

            departmentEntry
                    .getValue()
                    .getEmployees()
                    .stream()
                    .sorted((f, s) -> Double.compare(s.getSalary(), f.getSalary()))
                    .forEach(e -> System.out.println(e.toString()));
        });
    }
}
