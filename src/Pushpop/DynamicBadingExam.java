package Pushpop;

class Halbe {

	public void disp() {
		System.out.println("Hable");
	}
}

class Abe extends Halbe {
	public void disp() {
		System.out.println("Abe");
	}

	public void dispabe() {
		System.out.println("dispAbe");
	}
}

class Me extends Abe {
	public void disp() {
		System.out.println("Me");
	}
	public void dispabe() {
		System.out.println("dispme");
	}

}

public class DynamicBadingExam {
	public static void main(String[] args) {
		Me me = new Me();
		me.disp();
		Abe abe = new Abe();
		abe.disp();
		Halbe halbe = new Halbe();
		halbe.disp();

		halbe = abe; // 동적바인딩
		halbe.disp();
		
		halbe =me;
		halbe.disp();
		// halbe.dispabe();
	}
}
