package Java_8.Functional_Interface.Function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLengthFunction = s -> s.length();
        int length = stringLengthFunction.apply("Java is awesome!");
        System.out.println("Length of the string : "+length);
    }
}
