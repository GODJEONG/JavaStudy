package Day0313;

import java.util.HashMap;
import java.util.Set;

public class GenericEx5 {

	public static void main(String[] args) {
		String[] msg = {"a","b","c","c","e"};
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		for(int i=0; i<msg.length;i++) {
			map.put(i, msg[i]);

		}
		Set<Integer> keys = map.keySet();
		for(Integer n:keys)
			System.out.println(map.get(n));
	}
}
