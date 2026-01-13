package Threading.MultiThreading.ThreadClass;

public class PrintTable extends Thread{
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+(5*i));
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        PrintTable t = new PrintTable();
        t.start();
    }
}
