// Given a sentence, find the occurrence of each word
// input : "this is the sentence"
// output : {this=1, is=1, the=1, sentence=1}

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        
        String sentence = "this is the sentence";

        Map<String, Long> lengthOfWords = Arrays.stream(sentence.split(" "))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(lengthOfWords);
    }
}
