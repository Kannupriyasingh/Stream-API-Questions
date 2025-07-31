// Find the 2nd highest word's length in the given sentence

import java.util.Arrays;
import java.util.Comparator;

public class Question4 {
    public static void main(String[] args) {
        String sentence = "Find the word that has the second highesttttt length";

        int secondHigestStringLength = Arrays.stream(sentence.split(" "))
                                       .map(x -> x.length())
                                       .sorted(Comparator.reverseOrder())
                                       .skip(1)
                                       .findFirst()
                                       .get();


        System.out.println(secondHigestStringLength);                               
                                
    }
}
