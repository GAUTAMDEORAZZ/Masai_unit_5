package Problem_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Address address=new Address("Karnatka","Banglore", 23425);
		Employee emp=new Employee(107,"Sumit",address,"Sumit@gmail.com","martykhawoge");
		File f=new File("emp.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("The serializain done");
		oos.close();
		FileInputStream fio=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fio);
		
		try {
			Employee emp2=(Employee)ois.readObject();
			System.out.println(emp2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   ois.close();

	}

}
