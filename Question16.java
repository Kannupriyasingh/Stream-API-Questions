// Group pair anagram from a list of Strings. For 1 word consider only 1 anagram
// input : {"pat", "tap", "pan", "nap", "Team","tree", "meat"}
// output : [[pan,nap], [pat,tap], [Team,meat], [tree]]

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question16 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("pat", "tap", "pan", "nap", "Team","tree", "meat");

        Map<Object, List<String>>ans = list.stream()
        .collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split(""))
        .sorted()
        .collect(Collectors.toList())));

        System.out.println(ans.values());
    }

    // Approach 2
    // public static void main(String[] args) {
    //     List<String>words = Arrays.asList("bat", "tab", "eat", "tea", "tan", "nat");

    //     List<List<String>>res = words.stream()
    //     .collect(Collectors.groupingBy(
    //         word -> {
    //             char[] arr = word.toCharArray();
    //             Arrays.sort(arr);
    //             return new String(arr);
    //         }
    //     ))
    //     .values()
    //     .stream()
    //     .collect(Collectors.toList());

    //     System.out.println(res);
    // }
}


