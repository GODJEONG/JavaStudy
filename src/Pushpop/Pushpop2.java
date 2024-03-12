package Pushpop;
import java.util.Arrays;
import java.util.Scanner;

public class Pushpop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mystack st = new Mystack();
		Myqueue qu = new Myqueue();
		Memory me = null;

		int c1 = 0, c2 = 0; // c1 - 스택큐 선택 c2 - 배열 조회, push ,pop, 종료

		do {
			System.out.print("어떤 기능을 사용하시겠습니까?(1.Stack 2. Queue ): ");
			c1 = sc.nextInt();
			if (c1 == 1)
				me = st;
			else if (c1 == 2)
				me = qu;
			else {
				System.out.print("잘못 입력했습니다");
			}

			System.out.println("0. 배열조회 1. Push 2. Pop 3. back");
			System.out.print("번호 입력: ");
			c2 = sc.nextInt();

			switch (c2) {
			case 0:
				System.out.println("배열 조회: " + Arrays.toString(me.arr));
				break;
			case 1:
				System.out.println("Push할 값 입력: ");
				me.push(sc.nextInt());
				System.out.println("배열: " + Arrays.toString(me.arr));
				break;

			case 2:
				System.out.println("pop 완료 ");
				me.pop();
				System.out.println("배열: " + Arrays.toString(me.arr));
				break;
			case 3:
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;

			}
		} while (c2 != 4);

	}
}
