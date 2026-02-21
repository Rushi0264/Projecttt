package Java_8.Functional_Interface.Basic;

@FunctionalInterface
interface MyFunctionalInterface{
    void seyHello();
}

public class FIExample {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("Hello Functional Interface");
        obj.seyHello();
    }
}
