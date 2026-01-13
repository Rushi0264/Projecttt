package Threading.MultiThreading.ThreadClass;

public class DaemonThreadExample extends Thread{
    public void run(){
        while (true){
            System.out.println("Demon running...");
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample t = new DaemonThreadExample();

        t.setDaemon(true);
        t.start();

        System.out.println("Main thread finished");
    }
}
