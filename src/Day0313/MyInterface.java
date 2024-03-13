package Day0313;

public interface MyInterface {

	default void method1() {
		System.out.println("meth1 in inter");
	}
	default void method2() {
		System.out.println("meth2 in inter");
	}
	static void staticmethod() {
		System.out.println("statcmeth in inter");
	}
}
