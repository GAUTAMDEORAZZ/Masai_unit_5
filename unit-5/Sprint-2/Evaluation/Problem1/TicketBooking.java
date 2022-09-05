package Problem1;

public class TicketBooking implements Runnable {
	
	public String passengerName;
	public Integer noOfSeatBook;
	TicketCounter ticketCounter;
	
	public TicketBooking(String passengerName, Integer noOfSeatBook, TicketCounter ticketCounter) {
		super();
		this.passengerName = passengerName;
		this.noOfSeatBook = noOfSeatBook;
		this.ticketCounter = ticketCounter;
	}
	
	@Override
	public void run() {
		try {
			ticketCounter.bookSeat(passengerName, noOfSeatBook);
		} catch (NoSeatAvailableException e) {
			System.out.println(e.getMessage());
		}
	   }
	
	}
  
