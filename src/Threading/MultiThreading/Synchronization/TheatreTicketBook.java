package Threading.MultiThreading.Synchronization;

class TicketCounter extends Thread{
    private static int ticket = 5;

    static synchronized public void BookTicket(){
        if (ticket > 0){
            System.out.println("Ticket booked number : "+ticket);
            ticket--;

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        else {
            System.out.println("Ticket not available..!");
        }
    }
}

class MyThread extends Thread{
    TicketCounter counter;

    MyThread(TicketCounter counter){
        this.counter=counter;
    }

    public void run(){
        counter.BookTicket();
    }
}

public class TheatreTicketBook {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        TicketCounter counter1 = new TicketCounter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        MyThread t3 = new MyThread(counter);
        MyThread t4 = new MyThread(counter);

        MyThread tt1 = new MyThread(counter1);
        MyThread tt2 = new MyThread(counter1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        tt1.start();
        tt2.start();
    }
}
