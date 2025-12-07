package learningStreamFromBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// // Find Duplicate Numbers
// List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
// [1, 2]

public class problem9 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

        // Approach 1
        HashSet<Integer>visited = new HashSet<>();
        List<Integer>res = nums.stream()
                                .filter(n -> !visited.add(n)) // add returns false if already present
                                .toList();

        // Approach 2
        List<Integer> result = nums.stream()
                            .filter(n -> Collections.frequency(nums, n) > 1)
                            .distinct()
                            .toList();
                                            
        System.out.println(res);   
        System.out.println(result);                 
    }
}
