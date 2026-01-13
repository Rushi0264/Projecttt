package Threading.MultiThreading.ThreadClass;

public class UsingJoinMethodWaitMain extends Thread{
    public void run(){
        for (int i=1;i<=3;i++){
            System.out.println("Child : "+i);
            try{
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        UsingJoinMethodWaitMain t = new UsingJoinMethodWaitMain();
        t.start();

        t.join();

        System.out.println("Main thread finished..!");
    }
}
