package Threading;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from thread");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.start();
    }
}
