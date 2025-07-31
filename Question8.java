// Given a word, find the occurrence of each character

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String[] args) {
        String word = "occurrence";

        Map<String, Long> freqOfLetter = Arrays.stream(word.split(""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(freqOfLetter);

    }
    
}
