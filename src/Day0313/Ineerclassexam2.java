package Day0313;

public class Ineerclassexam2 {
	private int a;
	private int b;

	public void disp1() {
		new AAA() {
			@Override
			public void disp() {
				System.out.println(a);
				System.out.println(b);
			}
		}.disp();

	}
	
	public void disp2() {
		new Child().method1();
	}
	
	public static void main(String[] args) {
		Ineerclassexam2 inter =new Ineerclassexam2();
		inter.disp1();
		inter.disp2();
	}
}
