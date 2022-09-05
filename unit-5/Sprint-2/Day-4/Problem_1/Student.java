package Problem_1;
import java.io.*;


public class Student implements Serializable {
	private Integer roll;
	private  String name;
	Address address;
	private String email;
	transient String password;
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student(Integer roll, String name, Address address, String email, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	

}
