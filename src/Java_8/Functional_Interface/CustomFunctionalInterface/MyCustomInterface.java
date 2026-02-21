package Java_8.Functional_Interface.CustomFunctionalInterface;

@FunctionalInterface
interface CustomInterface{
    void doSomething(int value);
}

public class MyCustomInterface {
    public static void main(String[] args) {
        CustomInterface customFunction = value -> System.out.println("Value : "+value);
        customFunction.doSomething(40);
    }
}
