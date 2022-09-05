package Problem_4;

import java.io.Serializable;

public class Address implements Serializable {
	private String state;
	private String city;
	private Integer pincode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Address(String state, String city, Integer pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
