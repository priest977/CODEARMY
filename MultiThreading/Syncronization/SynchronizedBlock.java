package MultiThreading.Syncronization;

class BookThearterSeats1{
    int total_Seats = 10;
    void bookSeats(int seats) {
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());

        synchronized (this) { // That is called Syncronized Block it reduce the waiting block time to the code
            if (total_Seats >= seats) {
                System.out.println(seats + " :Seats book succefully!");
                total_Seats = total_Seats - seats;
                System.out.println(total_Seats + " :Seats Left");
            } else {
                System.out.println("Sorry Seats Cannot be booked");
                System.out.println(total_Seats + " :Seats Left");
            }
        }

        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
    }
}

public class SynchronizedBlock extends Thread {
    static BookThearterSeats1 b ;
    int seats;
    public void run(){
        b.bookSeats(seats);
    }
    public static void main(String[] args) {
        b = new BookThearterSeats1();
        SynchronizedBlock  nafish = new SynchronizedBlock ();
        nafish.seats=7;
        nafish.start();

        SynchronizedBlock  rishabh = new SynchronizedBlock ();
        rishabh.seats=8;
        rishabh.start();
    }
}
