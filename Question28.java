// remove all non numeric characters from a list
// input : ("a12b3c", "1a2b3c", "123abc")
// output : {123,123,123}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question28 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("a12b3c", "1a2b3c", "123abc");

        List<String>ans = list.stream()  // this will return the String list
                                .map(s->s.replaceAll("[^1-9]", ""))
                                .collect(Collectors.toList());


        List<Integer>ansInInt = list.stream() // this will return the Integer list
                                .map(s->s.replaceAll("[^1-9]", ""))
                                .map(Integer::valueOf) // here its converting into Integer
                                .collect(Collectors.toList());

        System.out.println(ans);
        System.out.println(ansInInt);
    }
}
