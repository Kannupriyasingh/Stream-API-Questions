// calculate the average of all the numbers
// input : [1,2,3,4,5]
// output : 3.0

import java.util.Arrays;
import java.util.List;

public class Question31 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5);

        // -------------------------- Approach 1 -------------------------- 
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("Average: " + (sum/list.size()));

        // -------------------------- Approach 2 -------------------------- 

        double average = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println("Average: " + average);
    }
}
