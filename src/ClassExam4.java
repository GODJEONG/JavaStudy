import java.util.Scanner;

public class ClassExam4 {

	// field -------------------------------------------------------------------
	private int num1, num2;
	private char oper;
	private double result;
	private char ans;

	// Constructor ------------------------------------------------------------
	public ClassExam4(int number1, int number2, char operation, char answer) {
		this.num1 = number1;
		this.num2 = number2;
		this.oper = operation;
		this.ans = answer;
	};

	// main method ------------------------------------------------------------
	public static void main(String[] args) { // method

		Scanner sc = new Scanner(System.in);
		// ClassExam4 calculator = new ClassExam4(1, 0, '+', 'y');
		System.out.print("1번 숫자를 입력하세요: ");
		int n1 = sc.nextInt();
		System.out.print("2번 숫자를 입력하세요: ");
		int n2 = sc.nextInt();
		System.out.print("사칙연산을 입력하세요: ");
		char op = sc.next().charAt(0);
		System.out.print("사칙연산을 다시 하실건가요?(Y/y): ");
		char an = sc.next().charAt(0);
		ClassExam4 calculator = new ClassExam4(n1,n2 , op, an);

		do {
			/*
			System.out.print("1번 숫자를 입력하세요: ");
			calculator.setnum1(sc.nextInt());
			System.out.print("사칙연산을 입력하세요: ");
			calculator.setoper(sc.next().charAt(0));
			System.out.print("2번 숫자를 입력하세요: ");
			calculator.setnum2(sc.nextInt());
			*/

			switch (calculator.getoper()) {
			case '+':
				calculator.result = calculator.plus(calculator.getnum1(), calculator.getnum2()); break;
			case '-':
				calculator.result = calculator.minus(calculator.getnum1(), calculator.getnum2()); break;
			case '*':
				calculator.result = calculator.multi(calculator.getnum1(), calculator.getnum2()); break;
			case '/':
				calculator.result = calculator.div(calculator.getnum1(), calculator.getnum2()); break;
			}
			System.out.print(calculator.getnum1() + "" + calculator.getoper() + "" + calculator.getnum2() + "= ");
			System.out.println(calculator.result);
			
	
		} while (calculator.getans() == 'Y' | calculator.getans() == 'y');

	}

	// get, set method
	// ----------------------------------------------------------------
	public void setnum1(int n) {
		num1 = n;
		System.out.println("숫자 " + num1 + "를 입력했습니다.");
	}

	public void setnum2(int n) {
		num2 = n;
		System.out.println("숫자 " + num2 + "를 입력했습니다.");
	}

	public void setoper(char n) {
		oper = n;
		System.out.println("사칙연산 " + oper + "를 입력했습니다.");
	}

	public void setans(char n) {
		ans = n;
	}

	public void setans(double c) {
		result = c;
	}

	public int getnum1() {
		return num1;
	}

	public int getnum2() {
		return num2;
	}

	public char getoper() {
		return oper;
	}

	public char getans() {
		return ans;
	}

	public double getresult() {
		return result;
	}

	public double plus(int a, int b) {
		return result = num1 + num2;
	}

	public double minus(int a, int b) {
		return result = num1 - num2;
	}

	public double multi(int a, int b) {
		return result = num1 * num2;
	}

	public double div(int a, int b) {
		return result = num1 / (double) num2;
	}
}
