public class In {
	private AA aa;
	private BB bb;
	private CC cc;

	public In() { // 생성자
		this.aa = new AA();
		this.bb = new BB();
		this.cc = new CC();
	}

	public void setAa(String a, int b, int c) {
		aa.setAa(a);
		bb.setAa(b);
		cc.setAa(c);
	}

	public String getA() {
		return aa.getAa();
	}

	public int getB() {
		return bb.getAa();
	}

	public int getC() {
		return cc.getAa();
	}

	public static void main(String[] args) {
		In In = new In();

		In.setAa("ff", 4, 5);
		// setAa("tt"); //

		System.out.println(In.getA());
		System.out.println(In.getB());
		System.out.println(In.getC());

	}
}