// find and print the strings containing only digits
// input : {"123", "abc", "123abc", "45"}
// output : {123, 45}

import java.util.Arrays;
import java.util.List;

public class Question29 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("123", "abc", "123abc", "45");

        List<String>ans = list.stream().filter(s->s.matches("[1-9]+")).toList();

        System.out.println(ans);
    }
}
