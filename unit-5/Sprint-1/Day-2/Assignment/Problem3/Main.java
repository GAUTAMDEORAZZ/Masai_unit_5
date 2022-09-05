package Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Problem2.Student;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(10,"Sumit",450));
		studentList.add(new Student(62,"Pulkit",170));
		studentList.add(new Student(23,"Alokit",890));
		studentList.add(new Student(14,"Pawan",870));
		studentList.add(new Student(25,"Rameshwar",370));
		studentList.add(new Student(61,"Pitamber",800));
		
       
       List<Employee> listOfEmp =studentList 
	  	.stream()
		.map(student ->{
			return new Employee(student.getRoll(), student.getName(), student.getMarks()*1000);
		}).collect(Collectors.toList());
       
       System.out.println(listOfEmp);
	}

}
