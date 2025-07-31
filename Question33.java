// There is list of employee objects having field,  name and email. Find the list of domains (gmail.com, yahoo.com etc), 
// and the occurance of each domain
// input : {employess object list}
// output : {@gmail.com=2, @yahoo.com=2}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class employee {
    String name;
    String email;
    
    employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "employee [name=" + name + ", email=" + email + "]";
    }
}

public class Question33 {
    public static void main(String[] args) {
        employee e1 = new employee("Famu", "famu@gmail.com");
        employee e2 = new employee("Jalu", "jalu@gmail.com");
        employee e3 = new employee("shinchan", "shinchan@yahoo.com");
        employee e4 = new employee("Doremon", "doremon@gmail.com");
        employee e5 = new employee("Nobita", "nobita@yahoo.com");

        List<employee> list = Arrays.asList(e1, e2, e3, e4, e5);

        Map<String, Long>ans = list.stream()
                                .map(x->x.getEmail().substring(x.getEmail().indexOf('@')))
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;


        System.out.println(ans);
    }
}
