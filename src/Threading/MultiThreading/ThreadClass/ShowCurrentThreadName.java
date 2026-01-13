package Threading.MultiThreading.ThreadClass;

public class ShowCurrentThreadName extends Thread{
    public void run(){
        //System.out.println("Running : "+currentThread().getName());

        for (int i=1; i<=3; i++){
            System.out.println("Running : "+currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ShowCurrentThreadName t1 = new ShowCurrentThreadName();
        ShowCurrentThreadName t2 = new ShowCurrentThreadName();

        t1.start();
        t2.start();
    }
}
