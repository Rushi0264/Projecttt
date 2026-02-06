package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

public class ConsumerEx1 {
    public static void main(String[] args) {
        Consumer<String> c = name -> System.out.println(name);
        c.accept("Rushikesh");
    }
}
