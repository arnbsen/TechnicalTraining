package Day5;
import java.util.Queue;
import java.util.PriorityQueue;
interface A{
	void func1();
}

public class Collections4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Without Generics
		Queue queue = new PriorityQueue();
		queue.add("Hello");
		queue.add("There!!!");
		
		System.out.println((String)queue.peek().toString());
		
		//With Generics
		Queue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Hello");
		queue1.add("There!!!");
		queue1.add("1There!!!");
		queue1.forEach(System.out::println); // Using lamda expressions
		
		//Using peek and poll
		System.out.println(queue1.peek());
		System.out.println(queue1.poll());
		System.out.println(queue1.toString());
		
	}

}
