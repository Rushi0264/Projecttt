package Java_8.Functional_Interface.Consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerWithMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        Consumer<Map.Entry<Integer, String>> c = e -> System.out.println(e.getKey()+" : "+e.getValue());
        map.entrySet().forEach(c);
    }
}
