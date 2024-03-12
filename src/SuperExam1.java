
class AnotherAA{

	private int a;

	public AnotherAA(int a) {
		this.a= a;
	}
	public int getA() {
		return a;
	}
}

class anotherBB extends AnotherAA {

	private int b;

public anotherBB(int a, int b) {
	super(a);
	this.b=b;
}

public int getB() {
	return b;
}

}

class anotherCC extends anotherBB {
	private int c;
	
	public anotherCC(int a, int b,int c) {
		super(a,b);
	
		this.c=c;
	}
	public int getC() {
		return c;
	}

}

public class SuperExam1 {
	public static void main(String[] args) {
		anotherCC cc = new anotherCC(10, 20, 30); // a=10 b=20 c=30

		System.out.println(cc.getA()); // 10
		System.out.println(cc.getB()); // 20
		System.out.println(cc.getC()); // 30

	}
}
