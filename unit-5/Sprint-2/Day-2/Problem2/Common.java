package Problem2;

public class Common {
	public static synchronized void fun1(String s) {
		System.out.println("Welcom Home Mr.");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(s);
	}
}

class ThreadA extends Thread{
	Common c;
	String name;
	public ThreadA(Common c, String name) {
		this.c=c;
		this.name=name;
	}
	@Override
	public void run() {
		c.fun1(name);
		
	}
}


class ThreadB extends Thread{
	Common c;
	String name;
	public ThreadB(Common c, String name) {
		this.c=c;
		this.name=name;
	}
	@Override
	public void run() {
		c.fun1(name);
	}
	
}

class Main{
	public static void main(String[] args) {
		Common obj1=new Common();
		Common obj2=new Common();
		ThreadA t1=new ThreadA(obj1, "Ram");
		ThreadB t2=new ThreadB(obj2, "Laxman");
		t1.start();
		t2.start();
		
	}
}
