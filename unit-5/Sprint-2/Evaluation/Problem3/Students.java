package Problem3;

public class Students {
	private String name;
	private Integer rollNo;
	private Integer marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public Students(String name, Integer rollNo, Integer marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	

}
