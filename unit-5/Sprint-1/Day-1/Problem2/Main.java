package Problem2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Student obj1=new Student("Sumit",2,340);
		Student obj2=new Student("Amit",4,370);
		Student obj3=new Student("SuSmita",6,440);
		Student obj4=new Student("Arti",1,470);
		Student obj5=new Student("Disumit",19,10);
		
		Map<Student, String> studentWithState =new TreeMap<>(new compareBymarks());
		studentWithState.put(obj1, "Maharastra");
		studentWithState.put(obj2, "Jharkhand");
		studentWithState.put(obj3, "Madhya Pradesh");
		studentWithState.put(obj4, "Punjab");
		studentWithState.put(obj5, "Meghalay");
		
//		System.out.println(studentWithState);
//		
		Set<Student> keySet=studentWithState.keySet();
		for (Student mystudent : keySet) {
			System.out.println(mystudent+"*******"+ studentWithState.get(mystudent));
		}
		
//		
//		for (Map.Entry<Student, String> entry : studentWithState.entrySet()) {
//			Object key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println(key + ">>>>"+val);
//			
//		}

	}

}
