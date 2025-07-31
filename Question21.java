// given a string group, the strings based on the middle character
// input : {"ewe", "jji", "jhj", "kwk", "aha"}
// output : {w=[ewe,kwk], h=[jhj,aha], j=[jji]}

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question21 {
    public static void main(String[] args) {
        String[] str = {"ewe", "jji", "jhj", "kwk", "aha"};

       Map<String, List<String>> map = Stream.of(str)
                                            .collect(Collectors.groupingBy(x->x.toString().substring(1, 2)));
        System.out.println(map);
    }
    
}
