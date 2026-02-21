package Java_8.Functional_Interface.Basic;

@FunctionalInterface
interface MyCalculator{
    int add(int a, int b);
}

public class FIExample3 {
    public static void main(String[] args) {
        MyCalculator obj = (a, b) -> a + b ;
        System.out.println("Addition of two numbers : "+obj.add(10,20));
    }
}
