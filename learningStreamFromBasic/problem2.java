package learningStreamFromBasic;
// Remove empty strings

import java.util.Arrays;
import java.util.List;

public class problem2 {
    public static void main(String[] args) {
        List<String>arr = Arrays.asList("kannu", "priya", "is", " ", "", "foodie");

        List<String>res = arr.stream()
                            .filter(w -> w != null && w.trim() != null && !w.trim().isEmpty())
                            .toList();

        System.out.println(res);
    }
    
}
