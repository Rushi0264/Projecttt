package AnonymousClass;

public class Demo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread running");
            }
        });
        t1.start();
    }
}
