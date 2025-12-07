package learningStreamFromBasic;

import java.util.Arrays;
import java.util.List;

// Distinct numbers

public class problem6 {
    public static void main(String[] args) {

        List<Integer>arr = Arrays.asList(2,4,3,6,7,1,6,5,8,9,1);

        List<Integer>distincIntegers = arr.stream().distinct().toList();

        System.out.println(distincIntegers);
    }
    
}
