package learningStreamFromBasic;

import java.util.Arrays;
import java.util.List;

// Get even numbers

public class problem3 {
    public static void main(String[] args) {
        List<Integer>arr = Arrays.asList(2,4,3,6,7,8,9,1);

        List<Integer>res = arr.stream()
                        .filter(n -> n%2==0)
                        .toList();

        System.out.println(res);
    }

}
