package Threading.MultiThreading.Runnable;

public class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable thread is running\n"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyTask());
        thread.start();
    }
}
