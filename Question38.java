// Convert a list to a map. Given a Employee object list, convert it into a map of key as 'City' and value as List<Employee>
// List<Employee> = Map<String, List<Employee>>

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    String city;

    Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
    }
}

public class Question38 {
    public static void main(String[] args) {
        Employee p1 = new Employee("ram", 10, "Delhi");
        Employee p2 = new Employee("shyam", 11, "Delhi");
        Employee p3 = new Employee("raghu", 12, "Mumbai");
        Employee p4 = new Employee("radha", 13, "Chennai");
        Employee p5 = new Employee("krishna", 8, "Pune");

        List<Employee> listOfEmployees = Arrays.asList(p1,p2,p3,p4,p5);

        Map<String, List<Employee>> ans = listOfEmployees.stream()
                                                .collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(ans);
    }
}
