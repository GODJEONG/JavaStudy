package Day0313;

import java.util.Scanner;

public class Exceptionexam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { // 예상되는 예외를 인식
			int num = sc.nextInt();
			System.out.println(3 / num);

		} catch (ArithmeticException ae) { // 예외처리
			System.out.println("0으로 입력하지마세요~");
			return;

		} catch (Exception in) {
			System.out.println("제대로 입력해");
		}

		finally {
			System.out.println("Bye");
		}
	}
}
