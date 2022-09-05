package Problem3;

import java.util.Scanner;

public class getallStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter your roll");
		int roll=sc.nextInt();
		
		
		StudentDao stu=new StudentdaoImpl();
   try {
	 Student student =stu.findStudentById( roll);
	 System.out.println(student);
	
} catch (StudentException e) {
	System.out.println(e.getMessage());
}
	
	}
	


}
