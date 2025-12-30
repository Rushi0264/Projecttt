package Threading;

public class JoinDemo extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=3;i++){
            System.out.println(getName()+" : "+i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.start();
        t1.join();

        t2.start();
    }
}
