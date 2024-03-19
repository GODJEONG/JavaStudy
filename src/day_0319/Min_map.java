package day_0319;

import java.util.HashMap;
import java.util.Set;

public class Min_map {
	private int key;
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	Min_sort ms = new Min_sort();

	public Min_map() {
		key = 1000;
	}

	public void result() {
		while (key < 10000) {
			map.put(key, ms.sortstring(key));	
			key++;
		}
		
		Set<Integer> key = map.keySet();
		for (Integer i : key) {
		System.out.println("Input: " + i + " Output: " + map.get(i));
		}
	}
}
