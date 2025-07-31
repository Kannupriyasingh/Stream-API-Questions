// concatenate 2 streams using stream API

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question42 {
    public static void main(String[] args) {
        Stream<String>stream1 = Stream.of("Java", "Python");
        Stream<String>stream2 = Stream.of("C++", "php");

        List<String>res = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(res);

    }
}
