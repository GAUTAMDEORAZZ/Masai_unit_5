package Problem1;

public class Main {

	public static void main(String[] args) {
		TicketCounter obj= new TicketCounter();
		TicketBooking tA= new TicketBooking("Sumit", 1, obj);
		TicketBooking tB= new TicketBooking("Amit", 2, obj);
		TicketBooking tC= new TicketBooking("Ramesh", 1, obj);
		
		Thread t1 = new Thread(tA);
		Thread t2 = new Thread(tB);
		Thread t3 = new Thread(tC);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

	}

}
