package Problem_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		LocalDate date = LocalDate.parse("1994-09-16");
		Employee employee=new Employee("Sumit",date, "Delhi", "Engineer",60000);
		
		File f= new File("OutObject.txt");
		    System.out.println(f.exists());
			f.createNewFile();
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			 oos.writeObject(employee);
			System.out.println("Serilize done");
			oos.close();
			
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee obj=(Employee)ois.readObject();
			System.out.println(obj);
			ois.close();
			
		} 
		

	}


