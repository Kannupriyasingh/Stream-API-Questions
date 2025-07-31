// Given a sentence, find the words with a specified number of vowels
// input: no of vowels = 2, sentence = "I am learning stream api in java"
// output: streams api java

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        String sentence = "I am learning stream api in java";
        int numberOfVowels = 2;

        Arrays.stream(sentence.split(" "))
            .filter(x-> x.replaceAll("[^aeiouAEIOU]", "").length() == numberOfVowels)
            .forEach(System.out::println);
    }
}
