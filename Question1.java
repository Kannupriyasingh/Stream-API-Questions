// Given a sentence find the word with highest length
import java.util.Arrays;
import java.util.Comparator;

public class Question1 {
    public static void main(String[] args) {
        String sentence = "Given a sentence find the word with highest length";

        String highestLengthWord = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(highestLengthWord);
    }
}
