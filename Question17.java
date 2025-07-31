// Write a program to multiply alternative numbers in an array
// input : {4,5,1,7,2,9,2}
// ouput: 16 (4*1*2*2)

import java.util.stream.IntStream;

public class Question17 {
    public static void main(String[] args) {
        int[] array = {4,5,1,7,2,9,2};
        
         int ans = IntStream.range(0, array.length)  // Generates index stream: 0, 1, 2, ...
                              .filter(i -> i % 2 == 0)              // Even indices
                              .map(i -> array[i])                   // Get the element at that index
                              .reduce(1, (a, b) -> a * b); // Multiply

        System.out.println(ans);
    }
}
