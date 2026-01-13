package Threading.MultiThreading.Synchronization;

class Greeting extends Thread{
    synchronized public void wish(String name){
        for (int i=1;i<=3;i++){
            System.out.println("Happy New Year --> 2026..❤️--> "+name);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class GreetingThread extends Thread{
    Greeting g;
    String name;

    GreetingThread(Greeting g, String name){
        this.g=g;
        this.name=name;
    }

    public void run(){
        g.wish(name);
    }
}

public class GreetingSyncDemo {
    public static void main(String[] args) {
        Greeting g = new Greeting();

        GreetingThread t1 = new GreetingThread(g,"Rushi");
        GreetingThread t2 = new GreetingThread(g,"Shubham");

        t1.start();
        t2.start();
    }
}
