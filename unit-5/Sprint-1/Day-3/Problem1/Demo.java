package Problem1;

public class Demo {

	public static void main(String[] args) {
	
  MyGenric<String> genString =new MyGenric<>();
      genString.add("Jhakhand");
     
      
      
      MyGenric<Integer> genInteger= new MyGenric<>();
      genInteger.add(5);
      
      
      System.out.println(genString.get());
      System.out.println(genInteger.get());
      
	}

}
