package Java_8.Functional_Interface.Basic;

@FunctionalInterface
interface MyPrinter{
    void print(String name);
}

public class FIExample2 {
    public static void main(String[] args) {
        MyPrinter obj = name -> System.out.println("Welcome : "+name);
        obj.print("Laxmi");
    }
}
