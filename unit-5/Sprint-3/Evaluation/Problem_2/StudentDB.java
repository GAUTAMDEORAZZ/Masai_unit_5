package Problem_2;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class StudentDB implements Serializable {
	Set<Student> studentsData=new HashSet<>();

public void addStudent(Student obj) {
	
	studentsData.add(obj);
}

@Override
public String toString() {
	return "StudentDB [studentsData=" + studentsData + "]";
}
  
}
