package Java_8.Functional_Interface.Basic;

public class FIExample4 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Thread Running");
        Thread t = new Thread(r);
        t.start();
    }
}
