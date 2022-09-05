package Problem1;

public class MyGenric <T> {
	T obj;
	void add(T obj){
		 this.obj=obj;
	}
	
	T get() {
		return obj;
	}

}
