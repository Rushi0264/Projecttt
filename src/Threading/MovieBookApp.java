package Threading;

class BookTheaterSeat{
    int totalSeat=10;
    synchronized void bookSeat(int seat){
        if (totalSeat >= seat){
            System.out.println(seat+" Seat book successfully");
            totalSeat=totalSeat-seat;
            System.out.println("Seat left : "+totalSeat);
        }
        else {
            System.out.println("Seat cannot be booked");
            System.out.println("Seat left : "+totalSeat);
        }
    }
}

public class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seat;
    public void run(){
        b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();

        MovieBookApp rushi = new MovieBookApp();
        rushi.seat=7;
        rushi.start();

        MovieBookApp avi = new MovieBookApp();
        avi.seat=4;
        avi.start();

/*        MovieBookApp ravi = new MovieBookApp();
        ravi.seat=2;
        ravi.start();*/
    }
}
