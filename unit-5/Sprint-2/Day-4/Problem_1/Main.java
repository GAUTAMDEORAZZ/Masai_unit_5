package Problem_1;
import java.io.*;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
////import java.io.IOException;
////import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		Address address=new Address("New York","New York","752623");
		Student obj =new Student(4,"Sumit", address,"Sumit@gmail..com","1252526");
		File f=new File("student.txt");
		f.createNewFile();
//		System.out.println(f.exists());
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
//		System.out.println("Serilizattion is done");
		oos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
//		Object obb= ois.readObject();
//		Student obj1=(Student)obb;
		
		Student obj1=(Student)ois.readObject();
		System.out.println(obj1);
		
       ois.close();
	}

}
