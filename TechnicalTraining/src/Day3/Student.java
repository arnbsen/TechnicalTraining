package Day3;

public class Student {
	static Student s1;
	String name;
	int roll;
	static int count;
	/*static {
		s1 = new Student();
		s1.name = "Arnab";			
	}*/

	private Student() {
		name = "Arnab";
		roll = 64;
	} 
	
	static Student getObject() {
		if(count < 1) {
			s1 = new Student();
			count = count + 1;
			return s1;

		}else {
			return s1;
		}
	}
}



