import java.util.Scanner;

public class ClassExam3 {
	private int num; 	// field
	private char oper;	// field
	
	public ClassExam3(int number) { 	// Constructor
		num = number;
	};
	public ClassExam3(char operation) { 	// Constructor
		oper = operation;
	};
	
	public static void main(String[] args) { 	// method

		char cn = 'Y';
		Scanner sc = new Scanner(System.in);
		ClassExam3 number = new ClassExam3(0);
		ClassExam3 operation = new ClassExam3('+');

		do {
			System.out.print("1번 숫자를 입력하세요: ");
			int a = number.input1(sc);
			System.out.print("2번 숫자를 입력하세요: ");
			int b = number.input1(sc);

			System.out.print("사칙연산을 입력하세요: ");
			char c = operation.input2(sc);
			double answer = calcul(a, b, c);
			output(answer);
			System.out.print("사칙연산을 다시 하실건가요?(Y/y): ");
			cn = sc.next().charAt(0);
		} while (cn == 'Y' | cn == 'y');
	}

	public int input1(Scanner sc) { // call by name
		int aa = sc.nextInt();
		System.out.println("숫자 " + aa + "를 입력했습니다.");
		return aa;
	}

	public char input2(Scanner sc) { // call by name
		char bb = sc.next().charAt(0);
		System.out.println("사칙연산 " + bb + "를 입력했습니다.");
		return bb;
	}

	public static double calcul(int a, int b, char c) {
		double answer = 0;
		switch (c) {
		case '+':
			answer = a + b;
			break;
		case '-':
			answer = a - b;
			break;
		case '*':
			answer = a * b;
			break;
		case '/':
			answer = (double) a / b;
			break;
		}
		return answer;
	}

	public static void output(double answer) {
		System.out.println("사칙연산 결과: " + answer);
	};

}
