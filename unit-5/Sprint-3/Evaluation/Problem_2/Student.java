package Problem_2;

import java.io.Serializable;

public class Student implements Serializable{
		   private Integer studentId;
			private String studentName;
			private String  studentAddress;
			private String student_email;
			transient private String cstudentPassword;
			public Integer getStudentId() {
				return studentId;
			}
			public void setStudentId(Integer studentId) {
				this.studentId = studentId;
			}
			public String getStudentName() {
				return studentName;
			}
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			public String getStudentAddress() {
				return studentAddress;
			}
			public void setStudentAddress(String studentAddress) {
				this.studentAddress = studentAddress;
			}
			public String getStudent_email() {
				return student_email;
			}
			public void setStudent_email(String student_email) {
				this.student_email = student_email;
			}
			public String getCstudentPassword() {
				return cstudentPassword;
			}
			public void setCstudentPassword(String cstudentPassword) {
				this.cstudentPassword = cstudentPassword;
			}
			@Override
			public String toString() {
				return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
						+ studentAddress + ", student_email=" + student_email + ", cstudentPassword=" + cstudentPassword
						+ "]";
			}
			public Student(Integer studentId, String studentName, String studentAddress, String student_email,
					String cstudentPassword) {
				super();
				this.studentId = studentId;
				this.studentName = studentName;
				this.studentAddress = studentAddress;
				this.student_email = student_email;
				this.cstudentPassword = cstudentPassword;
			}
			public Student() {
				super();
			}
			
			

	}



