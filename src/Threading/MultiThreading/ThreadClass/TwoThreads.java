package Threading.MultiThreading.ThreadClass;

class A extends Thread{
     public void run(){
        for (int i=1;i<=5;i++){
            System.out.print(" "+i);
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.print(" "+i);
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
