package Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Students> studentList =new ArrayList<>();
		studentList.add(new Students("Sumit",2,455));
		studentList.add(new Students("Ammit",4,245));
		studentList.add(new Students("yait",8,415));
		studentList.add(new Students("ramesh",3,215));
		studentList.add(new Students("jagdish",9,325));
		studentList.add(new Students("Suresh",12,157));
//		System.out.println(studentList);
		List<Students>sorted= studentList.
		stream().
		filter(s -> s.getMarks()<250 )
		.collect(Collectors.toList());
		System.out.println(sorted);
		

	}

}
