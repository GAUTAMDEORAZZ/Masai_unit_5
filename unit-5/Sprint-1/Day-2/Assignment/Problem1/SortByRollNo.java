package Problem1;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student>{
@Override
public int compare(Student o1, Student o2) {
	
	if(o1.rollNo<o2.rollNo) {
		return -1;
	}
	else if(o1.rollNo>o2.rollNo) {
		return 1;
	}
	else {
		return 0;
	}
	
}
}