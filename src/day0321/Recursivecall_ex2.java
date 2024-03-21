package day0321;

import java.util.Scanner;

public class Recursivecall_ex2 {

	private int n, a, b, e, c, i;
	Scanner sc = new Scanner(System.in);

	public Recursivecall_ex2() {
		n = a = e = c = 0;
		b = 1;
	}

	public static void main(String[] args) {
		Recursivecall_ex2 re = new Recursivecall_ex2();

		do {
			System.out.print("피보나치 수열의 몇번째 항을 보고 싶나요: ");
			re.n = re.sc.nextInt();
			System.out.println("계산 결과: " + re.recursive(re.n));

			System.out.print("다시 하시겠습니까?(1.네 2.아니오): ");
			re.e = re.sc.nextInt();
		} while (re.e == 1);

	}

	public int recursive(int n) {
		if (0< n && n <= 2) {
			return n-1;
		} else {
			return recursive(n - 1) + recursive(n - 2);
		}
	}
}
