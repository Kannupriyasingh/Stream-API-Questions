package learningStreamFromBasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Sort list

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{name = " + name + ", " + "salary= " + salary + "}";
    }
}

public class problem5 {
    public static void main(String[] args) {
        List<Integer>arr = Arrays.asList(2,4,6,3,7,8,9,1);
        List<String>stringArr = Arrays.asList("kannu", "priya", "is", "foodie");

        List<Integer>sortedArr = arr.stream().sorted().toList();
        List<String>sortedStringArr = stringArr.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(sortedArr);
        System.out.println(sortedStringArr);

        // for objects
        Employee e1 = new Employee("parth", 500000);
        Employee e2 = new Employee("ram", 100000000);
        Employee e3 = new Employee("laxman", 6454433);
        Employee e4 = new Employee("barath", 8989999);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        List<Employee>sortedEmployees = employees.stream().sorted(Comparator.comparing(e -> e.salary)).toList();
        List<Employee>reverseOrderEmployees = employees.stream().sorted(Comparator.comparing(e->e.salary).reversed()).toList();

        System.out.println(sortedEmployees);
        System.out.println(reverseOrderEmployees);

       

    }
}
