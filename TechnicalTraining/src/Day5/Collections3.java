package Day5;

import java.util.List;
import java.util.ArrayList;


public class Collections3 {
	public static void main(String[] args) {
		//Example of Java Generics in Collection
		
		
		//Without Generics
		List data = new ArrayList();
		data.add("jon snow");
		data.add("ned stark");
		
		String s1 = (String)data.get(0); //Needs type casting
		System.out.println(s1.toUpperCase());
		
		// Using Generics
		// Generics allow efficient handling of data, by mentioning data type
		// Using of Generics allow Collection classes to inherit the properties of the passed class <>
		// in the argument. So natively the collections can all methods on that class without the need 
		// explicit type casting.
		
		
		List<String> data1 = new ArrayList<String>();
		data1.add("jon snow");
		data1.add("ned stark");
		System.out.println(data1.get(0).toUpperCase());
		
		
		
	}
}