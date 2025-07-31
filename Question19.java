// program to move all zeros to the beginning of array int[]
// input : {1,0,3,0,5,0,0,6}
// output : {0,0,0,0,1,3,5,6}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question19 {
    public static void main(String[] args) {
        int[] array = {1,0,3,0,5,0,0,6};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        // ----------------------------- Approach 1 ---------------------------------------
        List<Integer> listOfZeros = list.stream().filter(x->x==0).collect(Collectors.toList());
        List<Integer> nonZeros = list.stream().filter(x->x!=0).collect(Collectors.toList());
        List<Integer>ans = Stream.concat(listOfZeros.stream(), nonZeros.stream()).collect(Collectors.toList());
        System.out.println(ans);

        // ----------------------------- Approach 2 ---------------------------------------
        long countOfZeros = list.stream().filter(x->x==0).count();
        List<Integer>ansUsingAppproach2 = Stream.concat(Collections.nCopies((int)countOfZeros, 0).stream(), nonZeros.stream())
                                                .collect(Collectors.toList());

        System.out.println(ansUsingAppproach2);
    }
}
