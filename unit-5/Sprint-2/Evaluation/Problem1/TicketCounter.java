package Problem1;

public class TicketCounter {
	static int availableSeat=3;
	
	public void bookSeat(String name,int numberOfSeat) throws NoSeatAvailableException {
		
		if(availableSeat!=0) {
			
			System.out.println(name + " has booked " +numberOfSeat+ " seat"  );
			availableSeat=availableSeat-numberOfSeat;
			
		}
		else {
			NoSeatAvailableException nsae=new NoSeatAvailableException( name + " There is no seat available for booking");
		    throw nsae;
		}
	}

}
