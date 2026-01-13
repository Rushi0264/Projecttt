package Threading.MultiThreading.ThreadClass;

public class ThreadLifeCycle1 extends Thread{

    public void run(){
        System.out.println("Thread running..");
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadLifeCycle1 t1=  new ThreadLifeCycle1();

        System.out.println("Before start : "+t1.getState());
        t1.start();
        System.out.println("After start : "+t1.getState());

        Thread.sleep(1000);

        System.out.println("After sleep : "+t1.getState());
    }
}
