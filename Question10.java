// Given an array, find the sum of unique elements
// input : {1,6,7,8,1,1,8,8,7} 
// output : 22 (6+7+8+1)

import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
        int [] array = {1,6,7,8,1,1,8,8,7};

        int sum = Arrays.stream(array).distinct().sum();

        System.out.println(sum);
    }
}
