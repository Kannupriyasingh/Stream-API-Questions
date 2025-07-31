// find the product of first two elements from an array
// input : [12,5,6,7,8]
// output : 60 (12*5)

import java.util.Arrays;
import java.util.List;

public class Question15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,5,6,7,8);

        //  General format of reduce :
        //  T result = stream.reduce(initialValue, (a, b) -> combine(a, b));

        int ans = list.stream().limit(2).reduce(1, (a,b)->a*b);

        System.out.println(ans);
    }
}
