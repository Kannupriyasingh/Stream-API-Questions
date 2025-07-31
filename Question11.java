// Given a string, find the first non-repeated character
// input : "hello world"
// output : h

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question11 {
    public static void main(String[] args) {
        String sentence = "Hello world Hh";

        //----------------------------------- Approach 1 -----------------------------------

        // indexOf(c) returns the index of the first occurrence of char c.
        // lastIndexOf(c) returns the index of the last occurrence of char c.

        String approach1Ans = Arrays.stream(sentence.split(""))
            .filter(c->sentence.indexOf(c) == sentence.lastIndexOf(c))
            .findFirst()
            .get();

        System.out.println(approach1Ans);

        //----------------------------------- Approach 2 -----------------------------------

        // without LinkedHashMap : { =1, r=1, d=1, e=1, w=1, H=1, l=3, o=2}
        // with LinkedHashMap : {H=1, e=1, l=3, o=2,  =1, w=1, r=1, d=1}

        char approach2Ans = sentence.chars().mapToObj(c->(char)c)  // LinkedHashMap is added to make the map char in sentence char order
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .map(m->m.getKey())
                .findFirst()
                .get();


        System.out.println(approach2Ans);
    }
}
