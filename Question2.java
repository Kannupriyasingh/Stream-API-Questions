// Remove duplicates from the string and return in the same order
// input : "dabcadefg" output : "dabcefg"

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        
        String str = "dabcadefg";
        
        str.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::print);  // approach 1
        System.out.println();
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);; //approach 2
    }
}
