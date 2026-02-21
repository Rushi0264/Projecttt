package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

public class SquareNumber {
    public static void main(String[] args) {
        Consumer<Integer> square = n -> System.out.println("Square of "+n+" : "+(n*n));
        square.accept(7);
    }
}
