package day0321;

import java.util.Scanner;

public class Recursivecall_ex1 {

	private int n, x, a, e;
	Scanner sc = new Scanner(System.in);

	public Recursivecall_ex1() {
		n = x = a = e = 0;
	}

	public static void main(String[] args) {
		Recursivecall_ex1 re = new Recursivecall_ex1();

		do {
			System.out.print("1. 반복문 2. 재귀: ");
			re.x = re.sc.nextInt();
			switch (re.x) {
			case 1: // 반복문
				re.factorial_for(re.sc);
				break;

			// 재귀
			case 2:
				re.a = 1;
				System.out.print("숫자를 입력하세요: ");
				re.n = re.sc.nextInt();
				System.out.println("계산 결과: " + re.factorial_self1(re.n));
				break;
			}
			System.out.print("다시 하시겠습니까?(1.네 2.아니오): ");
			re.e = re.sc.nextInt();
		} while (re.e == 1);

	}

	// 반복문
	public void factorial_for(Scanner sc) {
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		int a = 1;
		for (int i = n; i > 0; i--) {
			a *= i;
		}
		System.out.println("계산 결과: " + a);
	}

	// 재귀

	public int factorial_self(int n) {

		a *= n;
		if (n == 1)
			return a;
		factorial_self(n - 1);
		return a;
	}

	public int factorial_self1(int n) {
		if (n > 0)
			return n * factorial_self1(n - 1);
		else
		return 1;
	}
}
