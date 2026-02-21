package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

public class ConsumerValidation {
    public static void main(String[] args) {
        Consumer<String> validate = s -> System.out.println(s.isEmpty() ? "Invalid" : "Valid");

        validate.accept("Java");
        validate.accept("");
    }
}
