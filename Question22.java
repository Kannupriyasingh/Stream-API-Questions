// find sum of all elements in the list
// input : {1,2,3,4,5}
// output : 15

import java.util.Arrays;
import java.util.List;

public class Question22 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
