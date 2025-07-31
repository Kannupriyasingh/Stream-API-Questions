// Java 8 Stream API- 37 Group list of strings by their first character and count the number of strings
// input : {"apple", "banana", "apricot", "cherry", "blueberry", "avocado"}
// output : {a=3, b=2, c=1}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question37 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");

        Map<Character, Long> ans =list.stream()
                                    .map(s->s.charAt(0))
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(ans);

    }
}
