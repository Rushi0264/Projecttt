package Threading.MultiThreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        World world = new World();
        world.start();

        Test2 test2 = new Test2();
        test2.start();

        System.out.println("Main thread");
    }
}
