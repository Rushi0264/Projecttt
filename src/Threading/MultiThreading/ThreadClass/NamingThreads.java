package Threading.MultiThreading.ThreadClass;

public class NamingThreads extends Thread{

    public void run(){
        System.out.println("Running.. : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        NamingThreads t1 = new NamingThreads();
        NamingThreads t2 = new NamingThreads();

        t1.setName("FirstThread");
        t2.setName("SecondThread");

        //t1.start();
        t1.start();
        t2.start();
    }
}
