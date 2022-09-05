package Problem1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String, String> indianStatecapital=new HashMap<>();
		indianStatecapital.put("Jharkhand","Ranchi");
		indianStatecapital.put("karnataka","Banglore");
		indianStatecapital.put("Bihar","Patna");
		indianStatecapital.put("Sikkim","Gangtok");
		indianStatecapital.put("Uttrakhand","Dehradun");
		indianStatecapital.put("Telangana","Hydrabaad");
		
//		System.out.println(indianStatecapital.get("Sikkim"));
//		System.out.println(indianStatecapital.get("Jharkhand"));
//		Set<String> keySet=indianStatecapital.keySet();
//		for (String string : keySet) {
//			System.out.println(string+">>>>>><<<<<<"+ indianStatecapital.get(string));
//		}
		
		
		for (Map.Entry<String, String> entry :indianStatecapital.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(val +" is the capital of "+key );
		}
}

}
