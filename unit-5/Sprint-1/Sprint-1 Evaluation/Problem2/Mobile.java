package Problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	public String company;
	public String model;
	
	ArrayList<String> mobileModel=new ArrayList<>();
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model) {
		
		mobileModel.add(model);
		mobiles.put(company,mobileModel);
		
		String mess ="Mobile added successfully after adding a mobile";
		return mess;
	}
	public List<String> getModels(String company)throws InvalidMobileException{
		try {
			
		} catch (Exception e) {
			InvalidMobileException ime= new InvalidMobileException("Please enter company Name");
		    throw ime;
		}
		return mobileModel;
	}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.addMobile("Apple", "Iphone13");
		List<String> listOfMobiles;
		
		try {
			listOfMobiles = obj.getModels("Samsung");
			System.out.println(listOfMobiles);
		} catch (InvalidMobileException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
