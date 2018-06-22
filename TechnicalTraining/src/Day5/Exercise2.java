package Day5;
// Question: Write a program to calculate occurrences of words in the sentence
import java.util.Hashtable;
import java.util.Map;

public class Exercise2 {

	public static void main(String[] args) {
		String input = "In this one, we think we've reached the main verb when we get \"raced,\" but instead we are still inside a reduced relative cause. Relative clauses let us say, \"the speech given this morning\" instead of the \"the speech that was given this morning.\" Or, in this case, the horse raced past the barn\" instead of \"the horse that was raced past the barn\"";
		String[] sp = input.split("[\" ,.]+");
		Map<String, Integer> freq = new Hashtable<>();
		for(String i: sp) {
			if(!freq.containsKey(i)) {
				freq.put(i, 1);
			}else {
				freq.put(i, freq.get(i) + 1);
			}	
		}
		
		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
		     System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
