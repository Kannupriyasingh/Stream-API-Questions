// Given a list of strings, create a list that contains only integers
// input : {"abc", "123", "456", "hjl"}
// output : [123, 456]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question14 {
    public static void main(String[] args) {
        
        List<String> listOfStrings = Arrays.asList("abc", "123", "456", "hjl");

        List<Integer>ans = listOfStrings.stream()
            .filter(s->s.matches("[0-9]+"))
            .map(Integer::valueOf)
            .collect(Collectors.toList());

        
        System.out.println(ans);

        
    }
}
