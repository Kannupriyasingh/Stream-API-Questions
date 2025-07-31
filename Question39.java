// Multiply array elements
// input : {1,2,3,4,5}
// output : 120

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question39 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        List<Integer>list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Integer ans = list.stream().reduce(1, (a,b)->a*b); // here "1" is identity operator (An identity element is a value that doesn't affect the result of the operation.)

        System.out.println(ans);
    }
}

// | Operation                | Identity Element    | Why?                 |
// | ------------------------ | ------------------- | -------------------- |
// | **Addition**             | `0`                 | `a + 0 = a`          |
// | **Multiplication**       | `1`                 | `a * 1 = a`          |
// | **String Concatenation** | `""` (empty string) | `"abc" + "" = "abc"` |

// question -> why we use identity element
//  ** A safe fallback for empty streams
// If the stream is empty, the identity is returned directly — no crash, no nulls.
