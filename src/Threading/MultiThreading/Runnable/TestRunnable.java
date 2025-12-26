package Threading.MultiThreading.Runnable;

public class TestRunnable {
    public static void main(String[] args) {

        ImpleRunn impleRunn = new ImpleRunn();
        Thread thread = new Thread(impleRunn);
        thread.start();

        System.out.println("Hello ");
    }
}
