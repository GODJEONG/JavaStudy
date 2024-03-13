package Day0313;

public class Ineerclassexam1 {
private int a;
private static int b;

class disptest{
	private void disp() {
	System.out.println(a);
	System.out.println(b);
	}
}

public static void main(String[] args) {
	Ineerclassexam1.disptest a = new Ineerclassexam1().new disptest();
	a.disp();
}

}
