// Can we reuse stream in Java 8 ?
// answer -> NO

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question40 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5);

        Stream<Integer>stream = list.stream();

        // consumption 1
        stream.forEach(System.out::println);

        // consumption 2
        long listSize = stream.count();  // at this line we will get an exception (IllegalStateException: stream has already been operated upon or closed)
        System.out.println(listSize);

    }
}
