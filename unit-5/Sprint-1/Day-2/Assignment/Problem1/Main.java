package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
	
		List<Student> studentList= new ArrayList();

		studentList.add(new Student(10,"Sumit",450));
		studentList.add(new Student(62,"Pulkit",170));
		studentList.add(new Student(23,"Alokit",190));
		studentList.add(new Student(14,"Pawan",270));
		studentList.add(new Student(25,"Rameshwar",370));
		studentList.add(new Student(61,"Pitamber",610));
		studentList.add(new Student(37,"Swayamvar",230));
		System.out.println(studentList);
		
		List<Student> newList=  studentList
		.stream()
		.filter(s -> s.getMarks()>300)
		.collect(Collectors.toList());
		System.out.println(newList);

		
				
		
	
	}
	

}
