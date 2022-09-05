package Problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> listOfcity =new ArrayList<>();
		listOfcity.add("Mumbai");
		listOfcity.add("Pune");
		listOfcity.add("Kolkata");
		listOfcity.add("Chainei");
		listOfcity.add("Ranchi");
		listOfcity.add("Puri");
		listOfcity.add("Bhuwneshwar");
		
		PrintList obj = ( s )-> {
			System.out.println(s);
			};
		obj.display(listOfcity);
	}

}
