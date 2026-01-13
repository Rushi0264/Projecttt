package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CheckElementExist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Java Script");

        if (list.contains("Java Script")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
