package Java_8.Functional_Interface.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rushi");
        names.add("Om");
        names.add("Balaji");
        names.add("Ganesh");

        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);
    }
}
