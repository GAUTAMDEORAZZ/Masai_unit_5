package Problem3;

public class Main {

	public static void main(String[] args) {
		ThreadA t1=new ThreadA();
		ThreadB t2=new ThreadB();
		t2.start();
		try {
			t2.join();
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
		t1.start();
		
		
		
		
		

	}

}
