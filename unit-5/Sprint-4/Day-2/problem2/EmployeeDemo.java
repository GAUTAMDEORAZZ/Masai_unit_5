package com.masai.problem1;

public class EmployeeDemo {
	private Integer eid;
	private String name;
	private String address;
	private Integer salary;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public EmployeeDemo(Integer eid, String name, String address, Integer salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [eid=" + eid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	

}
