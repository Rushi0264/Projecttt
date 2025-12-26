package Threading.MultiThreading;

public class World extends Thread{
    @Override
    public void run(){
        System.out.println("World from run method");
    }
}
