package Day5;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

// Question: Extract unique words from the given sentence.

public class Exersice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "In this one, we think we've reached the main verb when we get \"raced,\" but instead we are still inside a reduced relative cause. Relative clauses let us say, \"the speech given this morning\" instead of the \"the speech that was given this morning.\" Or, in this case, the horse raced past the barn\" instead of \"the horse that was raced past the barn\"";
		String[] sp = input.split("[\" ,.]+");
		sc.close();
		Set<String> set1 = new HashSet<>();
		for(String i : sp) {
			set1.add(i);
		}
		System.out.println("Printing unique words\n");
		
		
		set1.forEach(System.out::println);
		

	}

}
