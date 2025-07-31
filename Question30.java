// convert a list of string into uppercase
// input : {"hello world", "stream api"}
// output : {"HELLO WORLD", "STREAM API"}

import java.util.Arrays;
import java.util.List;

public class Question30 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("hello world", "stream api");

        List<String>ans = list.stream().map(String::toUpperCase).toList();

        System.out.println(ans);
    }
}
