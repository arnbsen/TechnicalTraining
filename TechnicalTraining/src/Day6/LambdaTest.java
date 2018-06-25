package Day6;
import java.util.ArrayList;
import java.util.List;


class LamdbaClass{
	static void testLamdba(int n){
		System.out.println(n*n);
	}
	void testLambdaNonStatic(int n) {
		System.out.println(n*n);
	}
}
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.forEach(LamdbaClass::testLamdba);
		LamdbaClass l1 = new LamdbaClass();
		l.forEach(l1::testLambdaNonStatic);
		
	}

}
