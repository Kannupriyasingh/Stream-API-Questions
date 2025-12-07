package learningStreamFromBasic;

import java.util.List;

// Sum of Salary Using reduce()
// Employees: {Ram, 50000} {Shyam, 30000} {Geeta, 70000}
// 150000

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


public class problem11 {
    public static void main(String[] args) {
         List<Employee> employees = List.of(
            new Employee("A", "IT", 50000),
            new Employee("B", "HR", 40000),
            new Employee("C", "IT", 70000),
            new Employee("D", "Finance", 45000)
        );

        // Approach 1
        double sumOfSalary = employees.stream()
                                    .map(e -> e.salary)         // Stream<Integer>
                                    .reduce(0.0, (a, b) -> a + b); // reduce with identity 0

        // Approach 2
        double sumOfSalaries = employees.stream()
                                    .mapToDouble(e -> e.salary)
                                    .sum();
                            
        System.out.println(sumOfSalary);
        System.out.println(sumOfSalaries);
    }
    
}
