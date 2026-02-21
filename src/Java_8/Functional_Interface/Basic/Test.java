package Java_8.Functional_Interface.Basic;

public class Test {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello world")).start();
    }
}
