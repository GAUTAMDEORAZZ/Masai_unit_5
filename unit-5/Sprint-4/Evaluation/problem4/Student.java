package Problem3;

import java.util.Date;

public class Student {
	private String StudentName;
	private Integer Rollno;
	private String standard;
	private Date date_of_birth;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Integer getRollno() {
		return Rollno;
	}
	public void setRollno(Integer rollno) {
		Rollno = rollno;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public Student() {
		super();
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Student(String studentName, Integer rollno, String standard, Date date_of_birth) {
		super();
		StudentName = studentName;
		Rollno = rollno;
		this.standard = standard;
		this.date_of_birth = date_of_birth;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", Rollno=" + Rollno + ", standard=" + standard
				+ ", date_of_birth=" + date_of_birth + "]";
	}
	

}
