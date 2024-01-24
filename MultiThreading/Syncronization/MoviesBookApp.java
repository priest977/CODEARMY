package MultiThreading.Syncronization;

class BookThearterSeats{
    int total_Seats = 10;
        synchronized void bookSeats(int seats){
        if(total_Seats>=seats){
            System.out.println( seats + " :Seats book succefully!");
            total_Seats = total_Seats-seats;
            System.out.println(total_Seats + " :Seats Left");
        }
        else {
            System.out.println("Sorry Seats Cannot be booked");
            System.out.println(total_Seats + " :Seats Left");
        }
    }
}
public class MoviesBookApp extends Thread {
   static BookThearterSeats b ;
   int seats;
    public void run(){
        b.bookSeats(seats);
    }
    public static void main(String[] args) {
        b = new BookThearterSeats();
        MoviesBookApp nafish = new MoviesBookApp();
        nafish.seats=7;
        nafish.start();

        MoviesBookApp rishabh = new MoviesBookApp();
        rishabh.seats=8;
        rishabh.start();
    }
}
