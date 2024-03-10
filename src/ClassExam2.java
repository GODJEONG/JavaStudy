
public class ClassExam2 {

	// field
	private int a;

	// constructor
	public ClassExam2() { // 디폴트 생성자
	//	System.out.println("디폴트생성자");
	}

	public ClassExam2(int aa) { // 디폴트 생성자
		a = aa;
	}

	public void setA(int num) {
		a = num;
	}
	
	public int getA() {
		return a;	}
	
	// method
	public static void main(Str[] args) {

		ClassExam2 ce2 = new ClassExam2(); // 생성자 호출
		ClassExam2 ce3 = new ClassExam2(10); // 생성자 호출
		ClassExam2 ce4 = new ClassExam2(56); // 생성자 호출
		
		ce2.setA(500);
		System.out.println(ce2.getA());
		System.out.println(ce3.getA());
		System.out.println(ce4.getA());
	}
}