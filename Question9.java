// Given an int[] array, arrange the numbers in Descending/Ascending Order
// input: [1,2,3,4,5]
// output: 54321 / 12345

import java.util.Arrays;
import java.util.Collections;

public class Question9 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        Arrays.stream(array).mapToObj(x->x)  // ascending order
                .sorted()
                .forEach(System.out::print);

        System.out.println();

        Arrays.stream(array).mapToObj(x->x)  // descending order
                .sorted(Collections.reverseOrder())
                .forEach(System.out::print);;

        
    }
    
}
