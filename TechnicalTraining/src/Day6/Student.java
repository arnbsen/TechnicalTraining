package Day6;
class AgeNotApplicable extends Exception{

	public AgeNotApplicable() {
		// TODO Auto-generated constructor stub
		super("Age Not Applicable");
	}
	
}
public class Student { //POJO: Plain old Java Object or Java Bean
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeNotApplicable {
		if (age < 18) {
			throw new AgeNotApplicable();
		}else {
			this.age = age;
		}
	}

	public static void main(String[] args) throws AgeNotApplicable{
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setAge(20);
		s1.setName("Arnab");
		System.out.println(s1.getAge() + " " + s1.getName());
	}

}
