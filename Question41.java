// Convert a list of string to uppercase and then concatenate
// input : {"a", "b", "c", "d"}
// output : A B C D

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question41 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("a", "b", "c", "d");

        // ------------------------------ Approach 1 ------------------------------ 
        String ans = list.stream().map(String::toUpperCase).collect(Collectors.joining(" "));

        System.out.println(ans);

        // ------------------------------ Approach 2 ------------------------------ 
        String res = list.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + " " + s2).orElse("");

        System.out.println(res);
    }
    
}
