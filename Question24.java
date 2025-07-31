// Convert the list of integer into their square
// input : {1,2,3,4,5}
// output : {1,4,9,16,25}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question24 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer>squareList = list.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(squareList);
    }
}
