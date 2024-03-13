package Day0313;
import static java.lang.System.out;
import java.util.*;

public class GenericEx4 {

	public static void main(String[] args) {
	String[] groupa = {"a","b","c","d"};
	Stack<String> al = new Stack<String>();
	for(String n : groupa)
		al.push(n);
	
	System.out.println(al);

	while(!al.isEmpty())
		out.println(al.pop());
	}
}
