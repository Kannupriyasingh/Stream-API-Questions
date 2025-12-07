// find the kth smallest element in a list of integers
// input : {7,1,6,2,1,3,4,5}, k = 3
// output : 2

import java.util.Arrays;
import java.util.List;

public class Question27 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(7,1,6,2,1,3,4,5);
        int k = 3;

        int ans = list.stream()
                        .sorted()
                        .skip(k-1) // Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream. 
                        .findFirst()
                        .get();

        System.out.println(ans);
    }
}
