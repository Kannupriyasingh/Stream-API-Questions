// Given a list of integers, divide it into two lists of even and odd number

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,7,9,10);

        Map<Boolean, List<Integer>> collection1 = list.stream()  // approach 1
                .collect(Collectors.groupingBy(x->x%2==0, Collectors.toList()));

         Map<Boolean, List<Integer>> collection2 = list.stream() // approach 2
        .collect(Collectors.partitioningBy(x->x%2==0, Collectors.toList()));

        System.out.println(collection1.values());
        System.out.println(collection2.values());

    }
    
}
