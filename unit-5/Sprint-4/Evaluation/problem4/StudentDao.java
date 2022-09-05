package Problem3;

public interface StudentDao {
	
 public String insertStudentDetails(Student student);
 public Student findStudentById(int id)throws StudentException;
 public Student getStudentDetailsByNameAndId(String name,int id)throws StudentException;
 public String updateStudentById(int id,String name)throws StudentException;
 public String deleteStudentById(int id)throws StudentException;
 
}
