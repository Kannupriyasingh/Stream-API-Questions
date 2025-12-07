package learningStreamFromBasic;

import java.util.Arrays;
import java.util.List;

// Convert list to uppercase

public class problem1 {
    public static void main(String[] args) {
        List<String>arr = Arrays.asList("kannu", "priya", "is", "foodie");

        List<String>uppercase = arr.stream()
                                .map(String::toUpperCase)
                                .toList();

        System.out.println(uppercase);
    }
}
