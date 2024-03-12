package Pushpop;

import java.util.Arrays;
import java.util.Scanner;

public class Pushpop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mystack st = new Mystack();
		Myqueue qu = new Myqueue();
		int f = 0;
		int s = 0;
		int q = 0;
		int array=0;
		do {
			System.out.print("어떤 기능을 사용하시겠습니까?(0. 배열 조회 1.Stack 2. Queue 3. 종료): ");
			f = sc.nextInt();

			switch (f) {
			case 0:
				System.out.println("보고자하는 배열을 선택하세요(1.Stack 2.Queue)");
				array=sc.nextInt();
				if(array==1) {
					System.out.println("Stack 배열은: " + Arrays.toString(st.arr));
				}
				else if(array==2) {
					System.out.println("Queue 배열은: " + Arrays.toString(qu.arr));
				}
				break;
			case 1:
				System.out.print("1. Push 2. pop: ");
				s = sc.nextInt();
				if (s == 1) {
					System.out.println("Stack-Push할 값 입력: ");
					st.push(sc.nextInt());
				} else if (s == 2) {
					System.out.println("Stack-pop 완료(마지막값 제외) ");
					st.pop();
				} else {
					System.out.println("잘못 입력했습니다.");
				}
				break;

			case 2:
				System.out.print("1. Push 2. pop: ");
				q = sc.nextInt();
				if (q == 1) {
					
					System.out.println("Queue-Push할 값 입력: ");
					System.out.println("최초 i="+ qu.getcnt());
					qu.push(sc.nextInt());
					System.out.println("이후 i="+ qu.getcnt());
					System.out.println( qu.arr[0]);
					
				} else if (q == 2) {
					System.out.println("Queue-pop 완료(첫번째값 제외) ");
					qu.pop();
				} else {
					System.out.println("잘못 입력했습니다.");
				}
				break;

			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		} while (f != 3);

	}
}
