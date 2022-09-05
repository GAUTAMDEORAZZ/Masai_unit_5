package Problem_4;

import java.io.Serializable;

public class Employee implements Serializable{
	private Integer empid;
	private String empname;
	private Address address;
	private String email;
	transient private String password;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public Employee(Integer empid, String empname, Address address, String email, String password) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	

}
