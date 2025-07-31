// convert a list of integer into list of their square
// input : {1,2,3,4,5}
// ouput : {1,4,9,16,25}

import java.util.Arrays;
import java.util.List;

public class Question35 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> ans = list.stream().map(x->x*x).toList();

        System.out.println(ans);
    }
}
