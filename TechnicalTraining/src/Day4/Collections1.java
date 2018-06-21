package Day4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> data = new ArrayList<Object>();
		data.add("Hello");
		data.add(007);
		data.add(6.9f);
		data.add("Hello");
		data.add(false);
		
		System.out.println(data.get(0));
		
		
		//Normal For loop
		
		for(int i=0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		
		//For each implementation for iteration (Enhanced For loop)
		//for ( Type var : Collection){ } 
		
		for (Object i : data) {
			System.out.println(i);
		}
		
	}

}
