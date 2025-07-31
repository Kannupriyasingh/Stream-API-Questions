// find and print the distinct odd numbers
// input : {1,2,3,3,4,5,6,7}
// output : {1,5,7}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question25 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,5,6,7);

        List<Integer>distinctOddNumbers = list.stream().distinct().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println(distinctOddNumbers);
    }
}
