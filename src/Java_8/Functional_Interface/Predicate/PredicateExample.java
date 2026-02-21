package Java_8.Functional_Interface.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        boolean isEven = isEvenPredicate.test(10);
        System.out.println("Is the number even ? : "+isEven);
    }
}
