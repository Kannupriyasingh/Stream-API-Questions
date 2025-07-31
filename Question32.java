// find the intersection of two lists
// input : (1,2,3,4,5) (3,5,6,7)
// output : [3,5]

import java.util.Arrays;
import java.util.List;

public class Question32 {
    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(1,2,3,4,5);
        List<Integer>list2 = Arrays.asList(3,5,6,7);

        List<Integer>ans = list1.stream().filter(list2::contains).toList();

        System.out.println(ans);
    }
}
