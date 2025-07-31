// sort a list of string in alphabetical order
// input : {"zudio", "apple", "home", "tree", "parrot"}
// output : {"apple", "home", "parrot", "tree", "zudio"}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question23 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zudio", "apple", "home", "tree", "parrot");

        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
