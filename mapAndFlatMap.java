// difference between map and flatmap?
// map() transform each element of the stream into another element. It's one on one mapping
// use map when you have stream of elements and you want to apply a function to each element

// flatmap() transforms + flattens the resulting streams into one stream, usually when dealing with collections of collections.
// use flatmap when each element can be mapped to zero or more elements (when dealing with nested collections)

import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    List<String>colors;

    Person(String name, List<String>colors) {
        this.name = name;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", colors=" + colors + "]";
    }
}

public class mapAndFlatMap {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
            new Person("joy", Arrays.asList("red", "blue")),
            new Person("rocky", Arrays.asList("yellow", "blue")),
            new Person("golu", Arrays.asList("green", "pink")),
            new Person("rax", Arrays.asList("red", "blue")),
            new Person("teddy", Arrays.asList("black", "blue"))
        );

        List<List<String>> colorList = persons.stream().map(Person::getColors).toList();
        System.out.println(colorList);

        List<String> colorListFlattened = persons.stream().flatMap(x->x.getColors().stream()).toList();
        System.out.println(colorListFlattened);
    }

}
