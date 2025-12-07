package learningStreamFromBasic;

import java.util.Arrays;
import java.util.List;

// Filter Employees by Department
// [{Aman, HR}, {Riya, IT}, {Karan, HR}, {Megha, Sales}]
// "HR"

// [{Aman, HR}, {Karan, HR}]

class Employee {
    String name;
    int salary;
    String department;

    Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "{name = " + name + ", " + "salary= " + salary + ", " + "department= " + department + "}";
    }
} 

public class problem10 {
    public static void main(String[] args) {
        Employee e1 = new Employee("parth", 500000, "HR");
        Employee e2 = new Employee("ram", 100000000, "IT");
        Employee e3 = new Employee("laxman", 6454433, "Sales");
        Employee e4 = new Employee("barath", 8989999, "HR");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);
        String department = "HR";

        List<Employee> res = employees.stream()
                                .filter(e -> e.department != null && e.department.equals(department))
                                .toList();

        System.out.println(res);
    }
}
