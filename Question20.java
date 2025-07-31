// In an array return true if it contains distinct values and false otherwise
// input : {1,3,1,4,5}
// output : false (element 1 is not distinct)

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question20 {
    public static void main(String[] args) {
        int[] array = {1,3,1,4,5};

        int sizeOfDistinctItemArray = Arrays.stream(array).distinct().boxed().collect(Collectors.toList()).size();
        System.out.println(sizeOfDistinctItemArray == array.length);

        int sizeOfDistinctItemMap = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).size();
        System.out.println(sizeOfDistinctItemMap == array.length);

    }
}
