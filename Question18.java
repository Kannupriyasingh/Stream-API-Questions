// program to multiply 1st and last element, 2nd and 2nd last element, etc numbers in an array
// input : {4,5,1,7,2,9}
// output : {36 10 7} (36 (4*9) 10 (5*2) 7 (1*7))

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question18 {
    public static void main(String[] args) {

        int[] array = {4,5,1,7,2,9};

        List<Integer> ans = IntStream.range(0, array.length/2)
                .map(x -> array[x]*array[array.length-x-1])
                .boxed() // box the primitive int values to Integer
                .collect(Collectors.toList());

        System.out.println(ans);
        
    }
}
