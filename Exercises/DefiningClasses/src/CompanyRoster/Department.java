package CompanyRoster;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees;

    public Department() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public double averageSalary(){
        return employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }
}
