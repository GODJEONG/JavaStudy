package Day0313;

import static java.lang.System.out;
import java.util.*;

public class GenericEx3 {

	public static void main(String[] args) {

		String[] str = { "A", "A", "B", "C" };
	
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<String>();

		for (String a : str) {
			if (!hs1.add(a)) {
				hs2.add(a);
			}
		}
		out.println("hs1 : " + hs1);
		hs1.removeAll(hs2);
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);

	}
}
