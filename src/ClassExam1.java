
public class ClassExam1 {
	

	
	public static void main(String[] args) {
//
		ClassExam1 ce = new ClassExam1();  // 생성자함수 호출
		ce.output(1, 2);
		ce.output((double) 1);
		ce.output('1');
	}
	public void output(int a, int b) {
		System.out.println("a, b");
	}

	public void output(double a) {
		System.out.println("a");
	}

	public void output(int a) {
		System.out.println("int a");
	}

	public void output(char a) {
		System.out.println("char a");
	}
}