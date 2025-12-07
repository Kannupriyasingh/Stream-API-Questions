package learningStreamFromBasic.GroupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Count Occurrences of Each Character
// String s = "banana";
// { b=1, a=3, n=2 }

public class problem4 {
    public static void main(String[] args) {
        String s = "banana";

        // Step 1: Convert String to Stream<Character>
        List<Character> chars = s.chars() // IntStream
                            .mapToObj(c -> (char)c) // Stream<Character>
                            .collect(Collectors.toList());  

        // Step 2: Count occurrences of each character
        Map<Character, Long> res = chars.stream()
                                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(res);
    }
}
