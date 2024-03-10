
public class ClassExam8 {

	private int a, b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public ClassExam8(int a, int b) {
		this.a = a;
		this.b = b;
	};

	public ClassExam8() {
		this(0, 0);
	};

	public ClassExam8(int a) {
		this(a, 0);
	};

	public static void main(Str[] args) {

		ClassExam8 q = new ClassExam8();
		ClassExam8 w = new ClassExam8(1);
		ClassExam8 e = new ClassExam8(1, 1);

		System.out.println(q.a + " " + q.b);
		System.out.println(w.a + " " + w.b);
		System.out.println(e.a + " " + e.b);
		System.out.println(e.a + " " + e.b);
	}

}
