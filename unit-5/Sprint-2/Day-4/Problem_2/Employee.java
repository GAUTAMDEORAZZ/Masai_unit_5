package Problem_2;

import java.io.Serializable;
import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Employee implements Serializable {
	private String name;
	private LocalDate date_of_birth;
	private String department;
	private String designation;
	private  Integer salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(String name, LocalDate date_of_birth, String department, String designation, Integer salary) {
		super();
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", date_of_birth=" + date_of_birth + ", department=" + department
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
}
