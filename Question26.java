// find the union of two list
// input : {1,2,3,4,5} {6,7,8,9,10}
// ouput : {1,2,3,4,5,6,7,8,9,10}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question26 {
    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(1,2,3,4,5);
        List<Integer>list2 = Arrays.asList(6,7,8,9,10);

        List<Integer>union = Stream.concat(list1.stream(), list2.stream()).toList();

        System.out.println(union);
    }
}
