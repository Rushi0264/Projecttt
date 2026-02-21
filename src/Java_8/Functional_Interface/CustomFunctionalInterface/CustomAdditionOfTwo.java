package Java_8.Functional_Interface.CustomFunctionalInterface;
@FunctionalInterface
interface Addition{
    void add(int a, int b);
}
public class CustomAdditionOfTwo {
    public static void main(String[] args) {
        Addition addition =  (a, b) -> System.out.println("Addition : "+(a+b));
        addition.add(10,20);
    }
}
