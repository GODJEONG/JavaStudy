package Day0313;

public class InterExam1 implements CCC {

	public static void main(String[] args) {
		InterExam1 in =new InterExam1();
		CCC inter = new InterExam1(); // CCC 인터페이스로 객체 선언 가능

		inter.disp();
		in.disp();
		inter.disp2();
		in.disp3();
		
	}

	public void disp3() {
		System.out.println("Disp3");

	}

	@Override
	public void disp() {
		System.out.println("Disp");
	}

	@Override
	public void disp2() {
		System.out.println("Disp2");

	}
}
