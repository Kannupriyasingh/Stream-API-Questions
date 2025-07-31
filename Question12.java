// Given a string, find the first repeated character

import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question12 {
    public static void main(String[] args) {
        String sentence = "Hello world";

        //----------------------------------- Approach 1 -----------------------------------

        String ans = Arrays.stream(sentence.split(""))
            .filter(c->sentence.indexOf(c) != sentence.lastIndexOf(c))
            .findFirst()
            .get();
        
        System.out.println(ans);


        //----------------------------------- Approach 2 -----------------------------------

        Map<Character, Long> charMap = sentence.chars().mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        char character = charMap.entrySet().stream()
        .filter(x->x.getValue() > 1)
        .map(x->x.getKey())
        .findFirst()
        .get();

        System.out.println(character);

        
    }
    
}
