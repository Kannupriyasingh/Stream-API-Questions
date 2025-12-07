package learningStreamFromBasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find Nth Highest Salary
// [5000, 7000, 8000, 7000, 9000], 3
// 8000
public class problem8 {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(5000, 7000, 8000, 7000, 9000);
        int n = 3;

        int nthHighestSalary = salaries.stream()
                                    .distinct() // only if duplicates are present
                                    .sorted(Comparator.reverseOrder())
                                    .skip(n-1)
                                    .findFirst()
                                    .get();

        System.out.println(nthHighestSalary);

    }
    
}
