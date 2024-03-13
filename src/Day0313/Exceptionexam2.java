package Day0313;

import java.util.Scanner;

public class Exceptionexam2 {
	public static void main(String[] args) throws ArithmeticException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(3 / num);
		
		Thread.sleep(3000);
		
		System.out.println("Bye");
	}
}