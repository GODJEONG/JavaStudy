package Day0314;

public class Threadex1 extends Thread {
	private int[] temp;

	public Threadex1(String a) {
		super(a);
		temp = new int[10];
		for (int s = 0; s < temp.length; s++) {
			temp[s] = s;
		}
	}

	public void run() {
		for (int s : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드 이름: %s", currentThread().getName());
			System.out.printf("temp value: %d %n", s);
		}
	}

	public static void main(String[] args) {
		Threadex1 te = new Threadex1("superman");
		te.start();

	}

}
