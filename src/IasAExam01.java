class TT {
	
	public TT() {
		super();
		System.out.println("SUPER");
	}
	public String toString() {
		return super.toString() + " 추가: " + "superman";
	}

	public void disp() {
		System.out.println("A-------------");
	}
}

public class IasAExam01 extends TT {

	public IasAExam01() {
		// 부모의 생성자를 호출!!
		super();
		System.out.println("sub");
	}
	
	public static void main(String[] args) {

		IasAExam01 isa = new IasAExam01();
		System.out.println(isa);
		System.out.println(isa.toString());
		isa.disp();
	}

}
