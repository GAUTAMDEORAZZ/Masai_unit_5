package Problem_2;

import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws  Exception {
		Scanner sc =new Scanner(System.in);
		
//		StudentDB stdb=new StudentDB();
		
		StudentDB stdb=new StudentDB();
		for(int i=0; i<5; i++) {
			Student obj=new Student();
			System.out.println("Enter your Student id");
			obj.setStudentId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter your Name");
			obj.setStudentName(sc.nextLine());
			System.out.println("Enter your Address");
			obj.setStudentAddress(sc.nextLine());
			System.out.println("Enter your email");
			obj.setStudent_email(sc.nextLine());
			System.out.println("Enter your password");
			obj.setCstudentPassword(sc.nextLine());
			
			stdb.addStudent(obj);
		}
		
		File f=new File("dataBase.txt");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(stdb);
		oos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
        StudentDB stdb2=(StudentDB)ois.readObject();
        System.out.println(stdb2);
        
        ois.close();

	}

}
