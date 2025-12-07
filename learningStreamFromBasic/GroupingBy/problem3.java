package learningStreamFromBasic.GroupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{name= " + name + ", " + "salary= " + salary + "}";
    }
}

public class problem3 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("A", "IT", 50000),
            new Employee("B", "HR", 40000),
            new Employee("C", "IT", 70000),
            new Employee("D", "Finance", 45000)
        );

        Map<String, List<Employee>>res = employees.stream()
                                        .collect(Collectors.groupingBy(e -> e.department));

        System.out.println(res);

    }
}
