package Day4;


// Example of Overriding of  methods of super class java.lang.Object which is
// being extended by every class in Java.



public class Person {
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person { Name: " + this.name + " Age: " + Integer.toString(this.age) + " }";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p1 = (Person)obj; // Type casting the Object obj to Person p1 to access vars of Person class
		if(this.name.equals(p1.name) && this.age == p1.age) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Arnab", 21);
		System.out.println(p1.toString()); // Check for custom .toString()
		Person p2 = new Person("Random", 43);
		System.out.println(p2.equals(p1));
		Person p3 = new Person("Random", 43);
		System.out.println(p2.equals(p3)); //Check for custom .equals()
	}

}
