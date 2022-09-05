package Problem1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Employee implements Comparable<Employee>{
	private Integer empId;
	private  String name;
	private  String address;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
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
	
	public Employee(Integer empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return 1;
		
	}
	public static void main(String[] args) {
		Employee obj1=new Employee(1,"Sumit","Ranchi");
		Employee obj2=new Employee(2,"Amit","banglore");
		Map<Employee, Integer> employies =new TreeMap<>();
		employies.put(obj1, 123344);
		employies.put(obj2, 231344);
		employies.put(new Employee(5,"Ramesh","Delhi"), 323344);
		employies.put(new Employee(6,"Suresh","jaipur"), 2323344);
		employies.put(new Employee(8,"Rohni","Pune"), 623344);
		employies.put(new Employee(15,"Mohani","mumbai"), 234344);
		
		Set<Map.Entry<Employee, Integer>> keyValue=employies.entrySet();
		for (Map.Entry<Employee, Integer> entry :employies.entrySet()) {
			Employee key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key +"---"+ val);
		}
		
		
	}
	

}
