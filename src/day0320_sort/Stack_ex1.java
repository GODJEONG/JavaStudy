package day0320_sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack_ex1 {

	private int an;
	private String[] stack;
	ArrayList<String> al;
	StringBuilder sb = new StringBuilder();
	Scanner sc = new Scanner(System.in);

	public Stack_ex1() {
		an = 0;
		al = new ArrayList<String>();
		stack = new String[5];
	}

	public static void main(String[] args) {
		Stack_ex1 se = new Stack_ex1();

		do {
			se.input(se.sc);
			System.out.println("계속 입력하시겠습니까?(1.네 2.아니오): ");
			se.an = se.sc.nextInt();
		} while (se.an == 1);
		System.out.println("최종 입력 결과: " + se.format(se.al));

	}

	public void input(Scanner s) {
		System.out.print("숫자(1,2,3...) 혹은 기호[+,-,(,)]를 입력하세요: ");
		al.add(s.next());
		System.out.println("참고: ("+ al+" )");
	}

	public String format(ArrayList<String> a) {
		for (String i : a) {
			sb.append(i);
		}
		return sb.toString();
	}
	
	public String calcul(String a) {
		al.get()
		return a;
	}

}
