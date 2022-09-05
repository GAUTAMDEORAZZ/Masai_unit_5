package Problem1;



public class Mythread implements Runnable{
   int product=1;
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			this.product=this.product*i;
			
		}
		
	}
	public static void main(String[] args) {
		Mythread thread1=new Mythread();
		Thread t=new Thread(thread1);
		t.start();
		 try {
			t.join();
			System.out.println(thread1.product);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
