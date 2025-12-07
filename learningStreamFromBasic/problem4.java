package learningStreamFromBasic;

import java.util.Arrays;
import java.util.List;

// Sum of list

public class problem4 {
    public static void main(String[] args) {
        List<Integer>arr = Arrays.asList(2,4,3,6,7,8,9,1);

        int res = arr.stream()  // approach 1
                    .mapToInt(Integer::intValue)
                    .sum();

    
        int sum = arr.stream() // approach 2
                    .reduce(0, (a,b)->a+b);

        System.out.println(res);
        System.out.println(sum);
    }
}
