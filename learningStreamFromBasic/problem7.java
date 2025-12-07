package learningStreamFromBasic;

import java.util.Arrays;
import java.util.List;

// Find max / min

public class problem7 {
    public static void main(String[] args) {
        List<Integer>arr = Arrays.asList(2,4,3,6,7,1,6,5,8,9,1);

        int mini = arr.stream().reduce((a,b) -> Integer.min(a, b)).get();
        int maxi = arr.stream().reduce((a,b) -> Integer.max(a, b)).get();

        System.out.println(mini);
        System.out.println(maxi);
    }
}
