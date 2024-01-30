package src.TicketBookingApplication;

// This Application1 is Paytm
class Application1 implements Runnable{
    BookSeats obj; // Object of the BookSeat(BMG Cinema) for Application2 (Paytm)
    int id;
    int seats;
    Application1(BookSeats obj,int id, int seats){
        this.obj = obj;
        this.id = id;
        this.seats = seats;
    }
    @Override
    public void run(){
     obj.bookSeats(id,seats);
    }
}

// And this one "Application2" is BookMyShow.
class Application2 implements Runnable{
    BookSeats obj; // Object of the BookSeat(BMG Cinema) for Application2 (BookMyShow)
    int id;
    int seats;
    Application2 (BookSeats obj ,int id, int seats){
        this.obj = obj;
        this.id = id;
        this.seats = seats;
    }
    @Override
    public void run(){
        obj.bookSeats(id,seats);
    }
}


public class MovieApplication {
    public static void main(String[] args) {
        BookSeats obj = new BookSeats();
        Application1 deal1 = new Application1(obj,1234,7);
        Application1 deal2 = new Application1(obj,1235, 7);
        Thread thread1 = new Thread(deal1);
        Thread thread2 = new Thread(deal2);
        thread1.start();
        thread2.start();

        BookSeats obj2 = new BookSeats();
        Application2 deal3 = new Application2(obj2 ,1236,7);
        Application2 deal4 = new Application2(obj2,1237, 7);
        Thread thread3 = new Thread(deal3);
        Thread thread4 = new Thread(deal4);
        thread3.start();
        thread4.start();
    }
}
