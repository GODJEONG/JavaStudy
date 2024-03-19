package day0319_minchange;

import java.util.Arrays;

public class Min_sort {

	private String an;

	public Min_sort() {
		an = null;
	}

	public String sortstring(int a) {
		an = Integer.toString(a);
		char[] it = an.toCharArray(); // 문자열 >> 문자 배열 변환
		int zero = 0;
		Arrays.sort(it); // 문자 배열 오름차순 정렬

		for (int i = 0; i < it.length; i++) {
			if (it[i] == '0') {
				zero++;
			}
		}

		if (zero != 0) {
			it[0] = it[zero];
			it[zero] = '0';
		}

		String sortedString = new String(it); // 문자 배열 >> 문자열로 변환
		return sortedString;

	}

//	public static void main(String[] args) {
//		Min_sort ms = new Min_sort();
//		System.out.println(ms.sortstring(1500));
//	}

}
