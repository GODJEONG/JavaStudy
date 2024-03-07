
public class ClassExam7 {

	int a;
	int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public ClassExam7(int a, int b) {
		this.a = a;
		this.b = b;
	};
	
	public ClassExam7() {
//		this.a = 0;
//		this.b = 0;
		this(0, 0);
	};

	public ClassExam7(int a) {
//		this.a = a;
//		this.b = 0;
		this(a, 0);
	};

	public static void main(String[] args) {
		ClassExam7 th = new ClassExam7(20,30); // 0, 0
		ClassExam7 th2 = new ClassExam7(20,30); // 10 ,0
		ClassExam7 th3 = new ClassExam7(20, 30); // 20 , 30

		System.out.println(th.getA() + "+" + th.getB());
		System.out.println(th2.getA() + "+" + th2.getB());
		System.out.println(th3.getA() + "+" + th3.getB());
		System.out.println(th3.getA() + "+" + th3.getB());
	}
}
