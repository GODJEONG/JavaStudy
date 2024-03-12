
abstract class Area {
// 추상클래스
	public abstract void draw();
}

class Rect extends Area {

	public void draw() {
		System.out.println("Rect");
	};

}


class Circle extends Area {
	public void draw() {
		System.out.println("Circle");
	};
}

class Tri extends Area {
	public void draw() {
		System.out.println("Tri");
	};

}

public class AbsClassExam {
	public static void main(String[] args) {
		Tri tri = new Tri();
		tri.draw();
		Rect rect = new Rect();
		rect.draw();
		Circle cir = new Circle();
		cir.draw();
		String a="20240301";
		System.out.println(a.substring(4,6));
	}
}
