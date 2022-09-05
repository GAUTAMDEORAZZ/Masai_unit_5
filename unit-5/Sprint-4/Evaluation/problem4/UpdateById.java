package Problem3;

import java.util.Scanner;

public class UpdateById {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Your id");
		 int id=sc.nextInt();
		 System.out.println("Enter name to change");
		 String name=sc.nextLine();
		 sc.nextLine();
		
		 StudentDao stu=new StudentdaoImpl();
		 try {
			String std=stu.updateStudentById(id,name);
			System.out.println(std);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

}
