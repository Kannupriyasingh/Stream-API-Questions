package learningStreamFromBasic.GroupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group anagrams
// ["bat", "tab", "eat", "tea", "tan", "nat"]
// [bat, tab], [eat, tea], [tan, nat]

public class problem8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bat", "tab", "eat", "tea", "tan", "nat");

        // Approach 1
        Map<String, List<String>>res = words.stream()
                                        .collect(Collectors.groupingBy(word -> {
                                            char[] charArr = word.toCharArray();
                                            Arrays.sort(charArr);
                                            return new String(charArr);
                                        }));

        List<List<String>>anagrams = new ArrayList<>(res.values());
                                       

        // Approach 2
        List<List<String>> result = words.stream()
                                    .collect(Collectors.groupingBy(word -> {
                                        char[] arr = word.toCharArray();
                                        Arrays.sort(arr);
                                        return new String(arr);
                                    }))
                                    .values()
                                    .stream()
                                    .toList();
        
                                       
        System.out.println(anagrams);
        System.out.println(result);
    }
}
