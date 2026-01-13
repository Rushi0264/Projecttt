package Threading.MultiThreading.ThreadClass;

public class PrintNumber extends Thread{
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.print(" "+i);
        }
    }

    public static void main(String[] args) {
        PrintNumber t = new PrintNumber();
        t.start();
    }
}
