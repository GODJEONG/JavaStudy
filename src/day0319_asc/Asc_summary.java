package day0319_asc;

import java.util.ArrayList;
import java.util.Scanner;

public class Asc_summary {

	Scanner sc = new Scanner(System.in);
	Asc_calcul ac;
	private ArrayList<String> result;

	public Asc_summary() {
		ac = new Asc_calcul();
		result = new ArrayList<String>();
		;
	}

	public static void main(String[] args) {
		Asc_summary as = new Asc_summary();
		System.out.println("숫자 x, y를 입력하세요.");
		System.out.println("첫번째 숫자 x 범위: 100~9,999,999");
		System.out.println("첫번째 숫자 y 범위: x~9,999,999");
		as.ac.start();
		as.ac.end();

		System.out.println("[결과]");
		as.result = as.ac.sortstring(as.ac.range(as.ac.getstart(), as.ac.getend()));
		System.out.println(as.result);
		System.out.println("count: " + as.result.size());

	}

}
