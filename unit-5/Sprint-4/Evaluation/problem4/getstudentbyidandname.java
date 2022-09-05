package Problem3;

import java.util.Scanner;

public class getstudentbyidandname {

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Your id");
	 int id=sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter your name");
	 String n=sc.nextLine();
	 StudentDao stu=new StudentdaoImpl();
	 try {
		Student std=stu.getStudentDetailsByNameAndId(n, id);
		System.out.println(std);
	} catch (StudentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
