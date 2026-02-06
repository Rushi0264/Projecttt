package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

public class ConsumerChain {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("Name : "+s);
        Consumer<String> c2 = s -> System.out.println("Length : "+s.length());
        Consumer<String> c3 = s -> System.out.println(s.toUpperCase());

        c1.andThen(c2).andThen(c3).accept("java");
    }
}
