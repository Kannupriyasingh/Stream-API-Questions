// Given an array of integers, group the numbers by the range in which they belong
// input : {2,3,10,14,20,24,31,34,43,44,52,54}
// output :{0=[2,3], 10=[10,14], 20=[20,24], 30=[31,34], 40=[43.44], 50=[52,54]}

import java.util.*;
import java.util.stream.Collectors;

public class Question13 {

    public static void main(String[] args) {
        int[] array = {2,3,10,14,20,24,31,34,43,44,52,54};

        List<Integer> list =  Arrays.stream(array).boxed().collect(Collectors.toList());

        Map<Integer, List<Integer>>mapList = list.stream().collect(Collectors.groupingBy(x->x/10*10, Collectors.toList()));

        System.out.println(mapList);
    }

}
