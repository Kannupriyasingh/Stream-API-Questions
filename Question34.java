// Generate the first 10 numbers of fibonacci sequence
// output : 0 1 1 2 3 5 8 13 21 34

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question34 {
    public static void main(String[] args) {
        int sizeOfFibonacciSeq = 10;

        List<Integer>fibonacci = Stream.iterate(new int[] {0,1}, f->new int[] {f[1], f[0]+f[1]})
                                        .map(f->f[0])
                                        .limit(sizeOfFibonacciSeq).collect(Collectors.toList());

        System.out.println(fibonacci);

        
    }
}
