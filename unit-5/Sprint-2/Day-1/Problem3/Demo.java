package Problem3;

public class Demo implements Runnable {

	@Override
	public void run() {
		
	}
    public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread();
		for(int i=1; i<=10; i++) {
			if(i==6) {
				t1.sleep(5000);
			}
			System.out.println(i);
		}
	}
}
