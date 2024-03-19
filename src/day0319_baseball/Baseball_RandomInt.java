package day0319_baseball;

import java.util.HashSet;
import java.util.Random;

public class Baseball_RandomInt {

	Random rd;
	HashSet<Integer> set;

	public Baseball_RandomInt() {
		rd = new Random();
		set = new HashSet<Integer>();
	}

	public String Randomint() {

		set.clear();
		while (set.size() < 3) {
			int rn = rd.nextInt(10);
			set.add(rn);
		}

		StringBuilder sb = new StringBuilder();
		for (Integer i : set) {
			sb.append(i);
		}
		return sb.toString();

	}

//	public static void main(String[] args) {
//		Baseball_RandomInt br = new Baseball_RandomInt();
//		System.out.println(br.Randomint());
//	}
}