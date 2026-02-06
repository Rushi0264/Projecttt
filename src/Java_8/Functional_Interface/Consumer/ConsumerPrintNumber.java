package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

public class ConsumerPrintNumber {
    public static void main(String[] args) {
        Consumer<Integer> print = n -> System.out.println(n);
        print.accept(100);
    }
}
