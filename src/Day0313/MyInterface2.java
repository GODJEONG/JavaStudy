package Day0313;

public interface MyInterface2 {

		default void method1() {
			System.out.println("meth1 in inter2");
		}

		static void staticmethod2() {
			System.out.println("staticmeth2 in inter2");
		}
	}

