package Java_8.Functional_Interface.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
        add.accept(10,20);
    }
}
