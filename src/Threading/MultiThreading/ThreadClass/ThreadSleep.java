package Threading.MultiThreading.ThreadClass;

public class ThreadSleep extends Thread{
    public void run() {
        for (int i =1; i<=5;i++) {
            System.out.print(" " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleep t = new ThreadSleep();
        t.start();
    }
}
