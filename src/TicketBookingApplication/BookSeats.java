package src.TicketBookingApplication;


// Let suppose this BookSeat class is a Movie show in BMG Cinema BMG MALL, HARYANA
public class BookSeats {
//    There is Only 20 tickets are available, distributed to 2 platform BookMyShow and Paytm
    static int totalSeats = 20;
    static synchronized void bookSeats(int id, int seats){
            if(totalSeats >= seats){
                System.out.println(seats+" Seats Confirmed, for transaction id : " +id);
                int leftSeats = totalSeats - seats;
                totalSeats = leftSeats;
                System.out.println(leftSeats +" seats are left now, Hurry Up!! Book your seats ");
                System.out.println("______________________________________________________________________");
            }else{
                System.out.println("Sorry !! Only "+totalSeats +" are available, for transaction id : " +id);
            }
    }
}
