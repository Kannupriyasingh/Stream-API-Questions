// Transform Person object stream into a single string 
// output : RAM | SHYAM | RAGHU | RADHA | KRISHNA

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age =  age;
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

public class Question36 {
    public static void main(String[] args) {
        Person p1 = new Person("ram", 10);
        Person p2 = new Person("shyam", 11);
        Person p3 = new Person("raghu", 12);
        Person p4 = new Person("radha", 13);
        Person p5 = new Person("krishna", 8);

        List<Person> listOfPersons = Arrays.asList(p1,p2,p3,p4,p5);

        // -------------------------------- Approach 1 --------------------------------
        String res = listOfPersons.stream()
                            .map(p->p.getName())
                            .map(String::toUpperCase).
                            collect(Collectors.joining(" | "));
        
        System.out.println(res);

        // -------------------------------- Approach 2 --------------------------------
        Collector<Person, StringJoiner, String> personCollector = 
                                                Collector.of(
                                                    ()->new StringJoiner(" | "), 
                                                    (j,p)->j.add(p.name.toString().toUpperCase()), 
                                                    (j1,j2)->j1.merge(j2), 
                                                    StringJoiner::toString);
        
        String names = listOfPersons.stream().collect(personCollector);

        System.out.println(names);

    
    }
    
}
