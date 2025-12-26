package Threading.MultiThreading;

class Task1 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Count : "+i);
        }
    }
}

class Task2 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Count : "+i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.start();

        Task2 task2 = new Task2();
        task2.start();
    }
}
