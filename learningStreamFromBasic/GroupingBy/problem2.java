package learningStreamFromBasic.GroupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group Strings by Length
// ["aa", "bbb", "c", "dd", "eeee"]
// {
//   1 = [c],
//   2 = [aa, dd],
//   3 = [bbb],
//   4 = [eeee]
// }

public class problem2 {
    public static void main(String[] args) {
        List<String> names = List.of("aa", "bbb", "c", "dd", "eeee");

        Map<Integer, List<String>> res = names.stream()
                                            .collect(Collectors.groupingBy(name -> {
                                                char[] arr = name.toCharArray();
                                                int size = arr.length;
                                                return size;
                                            }));

        System.out.println(res);
    }
}
