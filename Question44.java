// Given a person list, fetch the list of name of persons
// whose age is greater than 30
// name should be unique
// names should be in sorted order

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class Question44 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("john", 43),
            new Person("peta", 34),
            new Person("anna", 25),
            new Person("ceta", 50),
            new Person("oora", 33)
        );

        List<String> ans = persons.stream()
                            .filter(x->x.getAge()>30)
                            .map(Person::getName)
                            .distinct()
                            .sorted()
                            .collect(Collectors.toList());


        System.out.println(ans);

        List<Person> ans1 = persons.stream()
                            .filter(x->x.getAge()>30)
                            .distinct()
                            .sorted(Comparator.comparing(Person::getName))
                            .collect(Collectors.toList());

        System.out.println(ans1);

    }
}
