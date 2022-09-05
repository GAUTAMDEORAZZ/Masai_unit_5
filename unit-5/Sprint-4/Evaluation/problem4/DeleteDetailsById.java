package Problem3;

import java.util.Scanner;

public class DeleteDetailsById {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Your id");
		 int id=sc.nextInt();
		 sc.nextLine();
		
		 StudentDao stu=new StudentdaoImpl();
		 try {
			String std=stu.deleteStudentById(id);
			System.out.println(std);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

}
