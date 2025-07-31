// Find the word that has the second highest length

import java.util.Arrays;
import java.util.Comparator;

public class Question3 {
    public static void main(String[] args) {
        String sentence = "Find the word that has the second highesttttt length";

        String secondHighest =  Arrays.stream(sentence.split(" "))
        .sorted(Comparator.comparing(String::length).reversed())
        .skip(1)
        .findFirst()
        .get();

        System.out.println(secondHighest);
    }
}
