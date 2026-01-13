package Threading.MultiThreading.ThreadClass;

public class ThreadSleepAlternate extends Thread{
    public void run(){
        for (int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleepAlternate t1 = new ThreadSleepAlternate();
        ThreadSleepAlternate t2 = new ThreadSleepAlternate();

        t1.start();
        t2.start();
    }
}
